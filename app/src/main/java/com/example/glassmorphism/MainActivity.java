package com.example.glassmorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import fr.tvbarthel.lib.blurdialogfragment.BlurDialogFragment;


public class MainActivity extends AppCompatActivity {

    EditText etFirstName, etLastName, etEmail, etContactNo, etDec;
    final int MIN_PASSWORD_LENGTH = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewInitializations();

    }

    void viewInitializations() {
        etFirstName = findViewById(R.id.et_first_name);
        etLastName = findViewById(R.id.et_last_name);
        etEmail = findViewById(R.id.et_email);
        etContactNo = findViewById(R.id.et_contact_no);
        etDec = findViewById(R.id.et_des);

        // To show back button in actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }




    // Checking if the input in form is valid
    boolean validateInput() {
//        if (etFirstName.getText().toString().equals("")) {
//            etFirstName.setError("Please Enter First Name");
//            return false;
//        }
//        if (etLastName.getText().toString().equals("")) {
//            etLastName.setError("Please Enter Last Name");
//            return false;
//        }
//        if (etEmail.getText().toString().equals("")) {
//            etEmail.setError("Please Enter Email");
//            return false;
//        }
//        if (etContactNo.getText().toString().equals("")) {
//            etContactNo.setError("Please Enter Contact No");
//            return false;
//        }
//        if (etDec.getText().toString().equals("")) {
//            etDec.setError("Please Enter Designation ");
//            return false;
//        }
//
//        // checking the proper email format
//        if (!isEmailValid(etEmail.getText().toString())) {
//            etEmail.setError("Please Enter Valid Email");
//            return false;
//        }

        return true;
    }

    boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    // Hook Click Event

    public void performEditProfile (View v) {
        if (validateInput()) {

            // Input is valid, here send data to your server



            String firstName = etFirstName.getText().toString();
            String lastName = etLastName.getText().toString();
            String email = etEmail.getText().toString();
            String contactNo = etContactNo.getText().toString();
            String Designation = etDec.getText().toString();

            Dialog dialog= new Dialog(MainActivity.this);

            dialog.setContentView(R.layout.dialog_layout);

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));


            dialog.show();


        }
    }

    public void submitProfile (View v) {

            String str = etFirstName.getEditableText().toString();
            String str2 = etLastName.getEditableText().toString();
            String final_str = str + str2;
            String email = etEmail.getEditableText().toString();
            String number = etContactNo.getEditableText().toString();
            String desig = etDec.getEditableText().toString();


            Intent intent = new Intent(getApplicationContext(), Neomorphism.class);
            intent.putExtra("name", final_str);
            intent.putExtra("email", email);
            intent.putExtra("contact", number);
            intent.putExtra("designation", desig);

            startActivity(intent);

        }

    }



