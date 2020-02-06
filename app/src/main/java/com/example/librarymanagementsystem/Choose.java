package com.example.librarymanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Choose extends AppCompatActivity {
    TextView ms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        getSupportActionBar().hide();
        ms=findViewById(R.id.wlcmsg);
        User user=new User(Choose.this);
        ms.setText("Welcome  :"+user.getName());

    }

    public void bookReturn(View view) {
        startActivity(new Intent(this,LoginSuccess.class));
    }

    public void bookIssue(View view) {startActivity(new Intent(this,IssuePage.class));    }


    public void logOut(View view) {
        new User(this).removeUser();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void findStudHistory(View view) {
        Toast.makeText(this, "Loading...", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,SearchDetail.class);
        //intent.putExtra("search_type", "student_history");
        startActivity(intent);
    }
}

