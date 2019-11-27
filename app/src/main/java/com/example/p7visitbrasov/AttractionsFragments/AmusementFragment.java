package com.example.p7visitbrasov.AttractionsFragments;

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
 * {@link Fragment} that displays a list of amusement attractions.
 */
public class AmusementFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of amusement attractions.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.adventure_image, getString(R.string.Adventure_title), getString(R.string.Adventure_description), getString(R.string.Adventure_contact)));
        contents.add(new Contents(R.drawable.aquatic_image, getString(R.string.Aquatic_title), getString(R.string.Aquatic_description), getString(R.string.Aquatic_contact)));
        contents.add(new Contents(R.drawable.dino_image, getString(R.string.Dino_title), getString(R.string.Dino_description), getString(R.string.Dino_contact)));
        contents.add(new Contents(R.drawable.bullet_image, getString(R.string.Bullet_title), getString(R.string.Bullet_description), getString(R.string.Bullet_contact)));
        contents.add(new Contents(R.drawable.superland_image, getString(R.string.Super_title), getString(R.string.Superland_description), getString(R.string.Superland_contact)));

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