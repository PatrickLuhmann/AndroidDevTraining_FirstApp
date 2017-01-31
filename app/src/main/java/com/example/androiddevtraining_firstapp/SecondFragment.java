package com.example.androiddevtraining_firstapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androiddevtraining_firstapp.R;

/**
 * Created by Patrick on 1/31/2017.
 */

public class SecondFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_fragment, container, false);
    }
}
