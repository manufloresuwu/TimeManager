package com.manuela.timemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import com.google.gson.Gson;
import com.manuela.timemanager.UserRepository;
import com.manuela.timemanager.User;

public class RegisterActivity extends Activity {

    private static final String LOG = RegisterActivity.class.getSimpleName();
    private Context context;

    private EditText nicknameEditText;
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText password2EditText;
    private Spinner ageSpinner;
    private Spinner genderSpinner;
    private Button registerButton;

    private String ageSelected = "";
    private String genderSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_register);

        initViews();
        addEvents();
    }

    private void initViews() {
        nicknameEditText = findViewById(R.id.nicknameEditText);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        password2EditText = findViewById(R.id.password2EditText);
        ageSpinner = findViewById(R.id.ageSpinner);
        genderSpinner = findViewById(R.id.genderSpinner);
        registerButton = findViewById(R.id.registerButton);
    }

    private void addEvents() {
        ageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                ageSelected = adapterView.getItemAtPosition(position).toString();
                Log.d(LOG, "onItemSelected:" + ageSelected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                genderSelected = adapterView.getItemAtPosition(position).toString();
                Log.d(LOG, "onItemSelected:" + genderSelected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateRegister();
            }
        });

    }

    private void validateRegister() {
        String nickname = nicknameEditText.getText().toString().trim();
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        String password2 = password2EditText.getText().toString().trim();

        if (nickname.isEmpty() || name.isEmpty() || email.isEmpty() || password.isEmpty() || password2.isEmpty() || ageSelected.isEmpty() || genderSelected.isEmpty()) {
            Toast.makeText(context, getString(R.string.error_fields), Toast.LENGTH_SHORT).show();
            return;
        }

        if (!isValidEmail(email)) {
            Toast.makeText(context, getString(R.string.error_email), Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(password2)) {
            Toast.makeText(context, getString(R.string.error_password), Toast.LENGTH_SHORT).show();
            return;
        }

        User newUser = new User(nickname, name, email, password, ageSelected, genderSelected);
        UserRepository.getInstance().register(newUser);
        finish();
    }


    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}