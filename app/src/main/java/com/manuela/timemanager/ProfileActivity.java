package com.manuela.timemanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import com.manuela.timemanager.UserRepository;
import com.manuela.timemanager.User;

public class ProfileActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("BuyyaPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        TextView nn = (TextView) findViewById(R.id.nicknameTextView);
        TextView n = (TextView) findViewById(R.id.nameTextView);
        TextView e = (TextView) findViewById(R.id.emailTextView);
        TextView p = (TextView) findViewById(R.id.passwordTextView);

        nn.setText(pref.getString("nickname",null));
        n.setText(pref.getString("name",null));
        e.setText(pref.getString("email",null));
        p.setText(pref.getString("password",null));

    }

}