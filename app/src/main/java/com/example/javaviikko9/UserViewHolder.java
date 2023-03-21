package com.example.javaviikko9;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView userImage;
        TextView userName, userDegree, userEmail;
        Button userDelete;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.ivUserImage);
            userName = itemView.findViewById(R.id.txtUserName);
            userDegree = itemView.findViewById(R.id.txtUserDegree);
            userEmail = itemView.findViewById(R.id.txtUserEmail);
            userDelete = itemView.findViewById(R.id.deleteButton);
        }
    }
