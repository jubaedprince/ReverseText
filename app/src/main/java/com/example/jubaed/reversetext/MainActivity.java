package com.example.jubaed.reversetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText editTextField;
    Button reverseMeButton, clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputText = (TextView) findViewById(R.id.outputText);
        editTextField = (EditText) findViewById(R.id.editTextField);
        reverseMeButton = (Button) findViewById(R.id.reverseMeButton);
        clearButton = (Button) findViewById(R.id.clearButton);
    }

    public void reverseWord(View view){
        outputText.setText(reverse(editTextField.getText().toString()));
    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public void clearButtonClicked(View view){
        outputText.setText("");
        editTextField.setText("");
    }

}
