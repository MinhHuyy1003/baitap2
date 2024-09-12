package com.example.bt2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button login_bt;
    EditText user_edt;
    EditText passWord_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        login_bt = (Button) findViewById(R.id.login_bt);
        user_edt = (EditText) findViewById(R.id.user_tv);
        passWord_edt = (EditText) findViewById(R.id.password_tv);

        login_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = user_edt.getText().toString();
                String passWord = passWord_edt.getText().toString();
                Toast.makeText(MainActivity.this, "Xin chào bạn " + userName, Toast.LENGTH_LONG).show();

                Log.i("LoginInfo", "Username: " + userName + " and password: " + passWord);
            }
        });
    }
}