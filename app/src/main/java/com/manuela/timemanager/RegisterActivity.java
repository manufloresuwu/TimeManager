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

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String nickname = "nicknameKey";
    public static final String name = "nameKey";
    public static final String email = "emailKey";
    public static final String password = "passwordKey";

    SharedPreferences sharedpreferences;

    private static final String LOG = RegisterActivity.class.getSimpleName();
    private Context context;

    private EditText nicknameEditText;
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText password2EditText;
    private Button registerButton;

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
        registerButton = findViewById(R.id.registerButton);
    }

    private void addEvents() {

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateRegister();

                String nn = nicknameEditText.getText().toString();
                String n = nameEditText.getText().toString();
                String e = emailEditText.getText().toString();
                String p = passwordEditText.getText().toString();

                SharedPreferences pref = getApplicationContext().getSharedPreferences("BuyyaPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("nickname", nn);
                editor.putString("name", n);
                editor.putString("email", e);
                editor.putString("password", p);
                editor.commit();
                Toast.makeText(RegisterActivity.this,"Entraste correctamente uwu",Toast.LENGTH_LONG).show();

                String f[]=new String[12];
                int k[]=new int[12];
                int l[]=new int[12];
                for(int i=0;i<12;i++){
                    f[i]="";
                    k[i]=0;
                    l[i]=0;
                }
                Intent intent = new Intent(RegisterActivity.this, CalendarActivity.class);
                intent.putExtra("tex", f);
                intent.putExtra("hora", k);
                intent.putExtra("minutos",l);
                intent.putExtra("tareas", 0);
                startActivity(intent);
            }
        });

    }

    private void validateRegister() {
        String nickname = nicknameEditText.getText().toString().trim();
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        String password2 = password2EditText.getText().toString().trim();

        if (nickname.isEmpty() || name.isEmpty() || email.isEmpty() || password.isEmpty() || password2.isEmpty()) {
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

        User newUser = new User(nickname, name, email, password);
        UserRepository.getInstance().register(newUser);
        finish();
    }


    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}