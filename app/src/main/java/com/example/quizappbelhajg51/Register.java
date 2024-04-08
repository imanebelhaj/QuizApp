package com.example.quizappbelhajg51;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    //step 1 : Declarations *********************************************88
    EditText etMail, etPassword, etPassword1;
    Button bRegister;
    TextView tvLogin;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        etMail=(EditText) findViewById(R.id.etMail);
        etPassword=(EditText) findViewById(R.id.etPassword);
        etPassword1=(EditText)findViewById(R.id.etPassword1);
        bRegister=(Button)findViewById(R.id.bRegister);
        tvLogin= (TextView) findViewById(R.id.Login);
        mAuth=FirebaseAuth.getInstance();

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=etMail.getText().toString();
                String password=etPassword.getText().toString();
                String password1=etPassword1.getText().toString();
                if(TextUtils.isEmpty(mail)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password1)){
                    Toast.makeText(getApplicationContext(),"Please confirm your password",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.length()<6){
                    Toast.makeText(getApplicationContext(),"Password must be at least 6 characters",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.equals(password1)){
                    Toast.makeText(getApplicationContext(),"Please enter correct password",Toast.LENGTH_SHORT).show();
                    return;
                }
                signUp(mail,password);

                //Commen.login=Mail;
                //Commen.password=password;
                Toast.makeText(getApplicationContext(),"Registration Successful!  註冊成功  ",Toast.LENGTH_LONG).show();

                startActivity(new Intent(Register.this,MainActivity.class));
                finish();
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4: Traitement
                startActivity(new Intent(Register.this, MainActivity.class));
            }
        });


    }
    private void signUp(String mail, String password) {
        mAuth.createUserWithEmailAndPassword(mail, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Registration Successful!  inscription réussi! التسجيل ناجح! 註冊成功  ",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(Register.this,MainActivity.class));
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(),"Registration Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}