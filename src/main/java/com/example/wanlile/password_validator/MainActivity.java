package com.example.wanlile.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static boolean strongpassword(String pw){
        //case insensitive
        char[] lc = {'P','A','S','S','W','O','R','D'};
        char[] uc = {'p','a','s','s','w','o','r','d'};
        if(pw.length()==8){
            boolean ispassword = true;
            for (int i = 0; i < 8; i++){
                if(pw.charAt(i) != lc[i] || pw.charAt(i) != uc[i])
                    ispassword = false;
            }
            if (ispassword) return false;
        }
        if (pw.length()<8) return false;

        boolean containUpper=false, containLower=false, containDigit=false, containSpecial=false;
        for (int i = 0; i < pw.length(); i++){
            if(Character.isDigit(pw.charAt(i)) ) containDigit = true;
            if(Character.isLowerCase(pw.charAt(i))) containLower = true;
            if(Character.isUpperCase(pw.charAt(i))) containUpper = true;
            if(!Character.isDigit(pw.charAt(i)) && ! Character.isLowerCase(pw.charAt(i)) && ! Character.isUpperCase(pw.charAt(i))) containSpecial = true;

        }
        return containDigit && containUpper && containLower && containSpecial;
    }

    public void Validate(View view) {
        EditText inputField = findViewById(R.id.password);
        String inputPassWord = inputField.getText().toString();

        boolean isStrong = strongpassword(inputPassWord);
        TextView outputField = findViewById(R.id.result);

        String result = "";
        if(isStrong) result = "Strong";
        else result = "Not Strong";

        outputField.setText(result);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
