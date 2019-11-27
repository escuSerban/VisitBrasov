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
 * {@link Fragment} that displays a list of outdoor attractions.
 */
public class OutdoorFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of outdoor attractions.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.tampa_image, getString(R.string.Tâmpa_title), getString(R.string.Tampa_description), getString(R.string.Tampa_contact)));
        contents.add(new Contents(R.drawable.zoo_image, getString(R.string.Zoo_title), getString(R.string.Zoo_description), getString(R.string.Zoo_contact)));
        contents.add(new Contents(R.drawable.seven_image, getString(R.string.Seven_title), getString(R.string.Seven_description), getString(R.string.Seven_contact)));
        contents.add(new Contents(R.drawable.lake_image, getString(R.string.Lake_title), getString(R.string.Lake_description), getString(R.string.Lake_contact)));
        contents.add(new Contents(R.drawable.poiana_image, getString(R.string.Poiana_title), getString(R.string.Poiana_description), getString(R.string.Poiana_contact)));

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
