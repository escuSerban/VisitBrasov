package com.example.p7visitbrasov.HotelsFragments;

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
 * {@link Fragment} that displays a list of hotels that allow pets.
 */
public class AllowsPetsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of hotels that allow pets.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.kismet_image, getString(R.string.Kismet_title), getString(R.string.Kismet_description), getString(R.string.Kismet_contact)));
        contents.add(new Contents(R.drawable.kronhaus_image, getString(R.string.Kronhaus_title), getString(R.string.Kronhaus_description), getString(R.string.Kronhaus_contact)));
        contents.add(new Contents(R.drawable.hirscher_image, getString(R.string.Hirscher_title), getString(R.string.Hirscher_description), getString(R.string.Hirscher_contact)));
        contents.add(new Contents(R.drawable.ambient_image, getString(R.string.Ambient_title), getString(R.string.Ambient_description), getString(R.string.Ambient_contact)));
        contents.add(new Contents(R.drawable.corona_image, getString(R.string.Corona_title), getString(R.string.Corona_description), getString(R.string.Corona_contact)));

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