package com.example.fragmentsimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Fragment fr1;
    Fragment fr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fr1 = new BlankFragment1();
        fr2 = new BlankFragment2();
    }

    public void chooseFragment(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.button1:
                fragmentTransaction.replace(R.id.fragmentContainerView, fr1);
                break;
            case R.id.button2:
                fragmentTransaction.replace(R.id.fragmentContainerView, fr2);
                break;
        }

        fragmentTransaction.commit();

    }
}