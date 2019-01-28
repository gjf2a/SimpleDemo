package edu.hendrix.ferrer.simpledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Author: Gabriel Ferrer
// This is a simple Android demo.

public class MainActivity extends AppCompatActivity {

    private Button reverser;
    private TextView userEntry;

    public static String reversed(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reverser = findViewById(R.id.doSomething);
        userEntry = findViewById(R.id.userEntry);

        reverser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userEntry.setText(reversed(userEntry.getText().toString()));
            }
        });
    }
}
