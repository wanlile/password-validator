package com.example.wanlile.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public boolean strongpassword(String pw){
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

        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
