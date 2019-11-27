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
 * {@link Fragment} that displays a list of restaurants with romantic ambiance.
 */
public class RomanticFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of restaurants with romantic ambiance.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.sub_image, getString(R.string.Sub_title), getString(R.string.Sub_description), getString(R.string.Sub_contact)));
        contents.add(new Contents(R.drawable.belvedere_image, getString(R.string.Belvedere_title), getString(R.string.Belvedere_description), getString(R.string.Belvedere_contact)));
        contents.add(new Contents(R.drawable.schei_image, getString(R.string.Schei_title), getString(R.string.Schei_description), getString(R.string.Schei_contact)));
        contents.add(new Contents(R.drawable.casa_image, getString(R.string.Casa_title), getString(R.string.Casa_description), getString(R.string.Casa_contact)));
        contents.add(new Contents(R.drawable.dei_image, getString(R.string.Dei_title), getString(R.string.Dei_description), getString(R.string.Dei_contact)));

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