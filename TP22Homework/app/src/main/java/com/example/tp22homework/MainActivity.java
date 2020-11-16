package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mshowcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowcount = findViewById(R.id.compteur_ID);


        if(savedInstanceState !=null ){
            mshowcount.setText(savedInstanceState.getString("Count_NB"));
            mCount = savedInstanceState.getInt("Nombre");
        }

    }

    public void Incremente_Compteur(View view) {
        mCount++;
        if(mshowcount != null){
            mshowcount.setText(Integer.toString(mCount));
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Count_NB", mshowcount.getText().toString());
        outState.putInt("Nombre", mCount);
    }

}
