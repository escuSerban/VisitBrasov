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
 * {@link Fragment} that displays a list of hotels with spa.
 */
public class SpaFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of hotels with spa.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.aro_image, getString(R.string.Aro_title), getString(R.string.Aro_description), getString(R.string.Aro_contact)));
        contents.add(new Contents(R.drawable.grand_image, getString(R.string.Grand_title), getString(R.string.Grand_description), getString(R.string.Grand_contact)));
        contents.add(new Contents(R.drawable.victoria_image, getString(R.string.Victoria_title), getString(R.string.Victoria_description), getString(R.string.Victoria_contact)));
        contents.add(new Contents(R.drawable.gradistei_image, getString(R.string.Gradistei_title), getString(R.string.Gradistei_description), getString(R.string.Gradistei_contact)));
        contents.add(new Contents(R.drawable.brasov_image, getString(R.string.Brasov_title), getString(R.string.Brasov_description), getString(R.string.Brasov_contact)));

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