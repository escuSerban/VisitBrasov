package com.example.p7visitbrasov.RestaurantsFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p7visitbrasov.Contents;
import com.example.p7visitbrasov.ContentsAdapter;
import com.example.p7visitbrasov.R;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants with localCuisine specific.
 */
public class LocalCuisineFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of restaurants with localCuisine specific.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.ceaun_image, getString(R.string.Ceaun_title), getString(R.string.Ceaun_description), getString(R.string.Ceaun_contact)));
        contents.add(new Contents(R.drawable.sergiana_image, getString(R.string.Sergiana_title), getString(R.string.Sergiana_description), getString(R.string.Sergiana_contact)));
        contents.add(new Contents(R.drawable.ceasu_image, getString(R.string.Ceasu_title), getString(R.string.Ceasu_description), getString(R.string.Ceasu_contact)));
        contents.add(new Contents(R.drawable.tudor_image, getString(R.string.Tudor_title), getString(R.string.Tudor_description), getString(R.string.Tudor_contact)));
        contents.add(new Contents(R.drawable.transilvania_image, getString(R.string.Transilvania_title), getString(R.string.Transilvania_description), getString(R.string.Transilvania_contact)));

        /**
         * Loading the recyclerView and setting it's adapter.
         */
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new ContentsAdapter(contents);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}