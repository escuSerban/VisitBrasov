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
 * {@link Fragment} that displays a list of heritage attractions.
 */
public class HeritageFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of heritage attractions.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.citadel_image, getString(R.string.Citadel_title), getString(R.string.Citadel_description), getString(R.string.Citadel_contact)));
        contents.add(new Contents(R.drawable.bran_image, getString(R.string.Bran_title), getString(R.string.Bran_description), getString(R.string.Bran_contact)));
        contents.add(new Contents(R.drawable.yekaterina_image, getString(R.string.Yekaterina_title), getString(R.string.Yekaterina_description), getString(R.string.Yekaterina_contact)));
        contents.add(new Contents(R.drawable.weavers_image, getString(R.string.Weavers_title), getString(R.string.Weavers_description), getString(R.string.Weavers_contact)));
        contents.add(new Contents(R.drawable.feldioara_image, getString(R.string.Feldioara_title), getString(R.string.Feldioara_description), getString(R.string.Feldioara_contact)));

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