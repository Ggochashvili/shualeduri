package com.example.shualeduri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity<editText> extends AppCompatActivity {
     EditText editTextFullname;EditText editTextUsername;
     Button ButtonRegistration;
     Object buttonRegistration;

    public void OnclickRegistration(View V) {
        editTextFullname = findViewById(R.id.FullNameBtn);
        editTextUsername = findViewById(R.id.UseNameBtn);
        buttonRegistration = findViewById(R.id.OnClickRegistrationBtn);
        if(Fullname.getText().toString().isEmpty() || Username.getText().toString.isEmpty()|| Age.getText().toString().isEmpty()){
            Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
        }
else if (Integer.parseInt(Age.getText().toString()) <1){
            Toast.makeText( this, "cant enter anything below 1", Toast.LENGTH_SHORT).show();
            Age.setText("");
        }
else if (Integer.parseInt(Age.getText().toString())<18){
    Toast.makeText(this, "be 18 or older ",Toast.LENGTH_SHORT).show();
    Age.setText("");

        }
else {
    Toast.makeText(this, "registration done ", Toast.LENGTH_SHORT).show();
    user Newuser = new user(Fullname.getText().toStirng(), Username.getText().toStirng(),Integer.parseInt((Age.getText().toString())));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}