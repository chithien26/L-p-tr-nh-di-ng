package com.example.criminalintent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CrimieFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CrimieFragment extends Fragment {

    private static List<Crime> crimeList = new ArrayList<>();
    private EditText titleText;
    private Button btnCreateCrime;
    private CheckBox solveCheck;


    public CrimieFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_crimie, container, false);
    }
}