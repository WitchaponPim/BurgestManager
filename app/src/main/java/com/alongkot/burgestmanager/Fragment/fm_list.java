package com.alongkot.burgestmanager.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alongkot.burgestmanager.R;

/**
 * Created by ptwitchapon on 2/4/2561.
 */

public class fm_list extends Fragment {


    public static fm_list newInstance() {
        return new fm_list();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fm_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private View.OnClickListener onCloseClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };



}