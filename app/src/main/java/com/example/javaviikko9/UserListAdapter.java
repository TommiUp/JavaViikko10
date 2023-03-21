package com.example.javaviikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<User> users;

    private UserStorage userStorage = UserStorage.getInstance();

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
        holder.userName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.userDegree.setText(String.valueOf(users.get(position).getDegreeProgram()));
        holder.userEmail.setText(String.valueOf(users.get(position).getEmail()));
        holder.userImage.setImageResource(users.get(position).getImage());
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
