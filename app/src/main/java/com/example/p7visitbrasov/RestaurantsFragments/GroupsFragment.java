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
 * {@link Fragment} that displays a list of restaurants suitable for groups.
 */
public class GroupsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of restaurants suitable for groups.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.prato_image, getString(R.string.Prato_title), getString(R.string.Prato_description), getString(R.string.Prato_contact)));
        contents.add(new Contents(R.drawable.bella_image, getString(R.string.Bella_title), getString(R.string.Bella_description), getString(R.string.Bella_contact)));
        contents.add(new Contents(R.drawable.keller_image, getString(R.string.Keller_title), getString(R.string.Keller_description), getString(R.string.Keller_contact)));
        contents.add(new Contents(R.drawable.sarbului_image, getString(R.string.Sarbului_title), getString(R.string.Sarbului_description), getString(R.string.Sarbului_contact)));
        contents.add(new Contents(R.drawable.gott_image, getString(R.string.Gott_title), getString(R.string.Gott_description), getString(R.string.Gott_contact)));

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