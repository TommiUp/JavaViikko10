package com.example.javaviikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<User> users;

    private UserStorage userStorage = UserStorage.getInstance();
    private int isChecked = 0;

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        isChecked = 0;
        holder.userName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.userDegree.setText(String.valueOf(users.get(position).getDegreeProgram()));
        holder.userEmail.setText(String.valueOf(users.get(position).getEmail()));
        holder.userImage.setImageResource(users.get(position).getImage());
        if (!users.get(position).getKandi().equals("")) {
            holder.userKandi.setVisibility(View.VISIBLE);
            holder.userKandi.setText(String.valueOf(users.get(position).getKandi()));
            isChecked = 1;
        } else {
            holder.userKandi.setVisibility(View.GONE);
        }
        if (!users.get(position).getDippa().equals("")) {
            holder.userDippa.setVisibility(View.VISIBLE);
            holder.userDippa.setText(String.valueOf(users.get(position).getDippa()));
            isChecked = 1;
        } else {
            holder.userDippa.setVisibility(View.GONE);
        }
        if (!users.get(position).getTohtori().equals("")) {
            holder.userTohtori.setVisibility(View.VISIBLE);
            holder.userTohtori.setText(String.valueOf(users.get(position).getTohtori()));
            isChecked = 1;
        } else {
            holder.userTohtori.setVisibility(View.GONE);
        }
        if (!users.get(position).getMaisteri().equals("")) {
            holder.userMaisteri.setVisibility(View.VISIBLE);
            holder.userMaisteri.setText(String.valueOf(users.get(position).getMaisteri()));
            isChecked = 1;
        } else {
            holder.userMaisteri.setVisibility(View.GONE);
        }
        if (isChecked == 1){
            holder.userTitle.setVisibility(View.VISIBLE);
        } else {
            holder.userTitle.setVisibility(View.GONE);
        }
        holder.userDelete.setOnClickListener(v -> removeUser(users.get(position)));
    }

    public void removeUser(User user) {
        int position = users.indexOf(user);
        users.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
