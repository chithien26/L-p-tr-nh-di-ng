package com.example.criminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.internal.EdgeToEdgeUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private static List<Crime> crimeList = new ArrayList<>();
    private EditText titleText;
    private Button btnCreateCrime;
    private CheckBox solveCheck;
//    public static void createCrime(String title, Boolean solve){
//        Crime c = new Crime();
//        c.setTitle(title);
//        c.setSolved(solve);
//        crimeList.add(c);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fra)



    }
}