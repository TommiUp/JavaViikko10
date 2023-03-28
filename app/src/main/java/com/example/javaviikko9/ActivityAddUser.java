package com.example.javaviikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class ActivityAddUser extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private RadioGroup rgDegree;
    private RadioButton degreeButton;
    private String addDegree;
    private RadioGroup rgImage;
    private int addImage;
    private CheckBox checkKandi;
    private CheckBox checkDippa;
    private CheckBox checkTohtori;
    private CheckBox checkMaisteri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        firstName = findViewById(R.id.firstNameText);
        lastName = findViewById(R.id.lastNameText);
        email = findViewById(R.id.emailText);
        rgDegree = findViewById(R.id.degreeRadioGroup);
        rgImage = findViewById(R.id.imageRadioGroup);
        checkKandi = findViewById(R.id.checkBoxKandi);
        checkDippa = findViewById(R.id.checkBoxDippa);
        checkTohtori = findViewById(R.id.checkBoxTohtori);
        checkMaisteri = findViewById(R.id.checkBoxMaisteri);
    }
    public void addUser(View view) {
        String addFirstName = firstName.getText().toString();
        String addLastName = lastName.getText().toString();
        String addEmail = email.getText().toString();
        switch (rgDegree.getCheckedRadioButtonId()) {
            case R.id.titeButton:
                degreeButton = findViewById(R.id.titeButton);
                addDegree = degreeButton.getText().toString();
                break;
            case R.id.tutaButton:
                degreeButton = findViewById(R.id.tutaButton);
                addDegree = degreeButton.getText().toString();
                break;
            case R.id.lateButton:
                degreeButton = findViewById(R.id.lateButton);
                addDegree = degreeButton.getText().toString();
                break;
            case R.id.sahkoButton:
                degreeButton = findViewById(R.id.sahkoButton);
                addDegree = degreeButton.getText().toString();
                break;
        }
        switch (rgImage.getCheckedRadioButtonId()) {
            case R.id.kuva1Button:
                addImage = R.drawable.ic_launcher_foreground;
                break;
            case R.id.kuva2Button:
                addImage = R.drawable.img;
                break;
        }
        String addKandi = "";
        String addDippa = "";
        String addTohtori = "";
        String addMaisteri = "";
        if (checkKandi.isChecked()){
            addKandi = checkKandi.getText().toString();
        }
        if (checkDippa.isChecked()){
            addDippa = checkDippa.getText().toString();
        }
        if (checkTohtori.isChecked()){
            addTohtori = checkTohtori.getText().toString();
        }
        if (checkMaisteri.isChecked()){
            addMaisteri = checkMaisteri.getText().toString();
        }
        User newUser = new User(addFirstName, addLastName, addEmail, addDegree, addImage);
        UserStorage.getInstance().addUser(newUser);
        newUser.setKandi(addKandi);
        newUser.setDippa(addDippa);
        newUser.setTohtori(addTohtori);
        newUser.setMaisteri(addMaisteri);
        UserStorage.getInstance().saveUsers(this);
        finish();
    }
}