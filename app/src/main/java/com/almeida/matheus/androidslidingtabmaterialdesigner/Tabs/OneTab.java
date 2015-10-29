package com.almeida.matheus.androidslidingtabmaterialdesigner.Tabs;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.almeida.matheus.androidslidingtabmaterialdesigner.R;

public class OneTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.one_tab,container,false);
        return v;
    }
}