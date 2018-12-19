package com.example.a3embed.fragmentbottomnavigation.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3embed.fragmentbottomnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Life", "onAttach() of NotificationFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Life", "onCreate() of NotificationFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Life", "onCreateView() of NotificationFragment");
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Life", "onActivityCreated() of NotificationFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Life", "onStart() of NotificationFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Life", "onResume() of NotificationFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Life", "onPause() of NotificationFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Life", "onStop() of NotificationFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Life", "onDestroyView() of NotificationFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Life", "onDestroy() of NotificationFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Life", "onDetach() of NotificationFragment");
    }

}
