package com.example.MiniDouyin;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.airbnb.lottie.LottieAnimationView;

public class PlaceholderFragment extends Fragment {

    private LottieAnimationView animationView;
    private ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_placeholder, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        animationView=getView().findViewById(R.id.animation_view);
        listView=getView().findViewById(R.id.Listview);
        getView().postDelayed(new Runnable() {
            @Override
            public void run() {
                animationView.animate().alpha(0).start();
                listView.animate().alpha(1).start();
            }
        }, 5000);
    }
}
