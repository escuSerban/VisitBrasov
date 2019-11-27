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
 * {@link Fragment} that displays a list of luxury hotels.
 */
public class LuxuryFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        /**
         * Create a list of luxury hotels.
         */
        final ArrayList<Contents> contents = new ArrayList<>();
        contents.add(new Contents(R.drawable.kronwell_image,getString(R.string.Kronwell_title), getString(R.string.Kronwell_description), getString(R.string.Kronwell_contact)));
        contents.add(new Contents(R.drawable.katharina_image,getString(R.string.Katharina_title), getString(R.string.Katharina_description), getString(R.string.Katharina_contact)));
        contents.add(new Contents(R.drawable.deutsches_image,getString(R.string.Deutsches_title), getString(R.string.Deutsches_description), getString(R.string.Deutsches_contact)));
        contents.add(new Contents(R.drawable.jasmine_image,getString(R.string.Jasmine_title), getString(R.string.Jasmine_description), getString(R.string.Jasmine_contact)));
        contents.add(new Contents(R.drawable.ezio_image,getString(R.string.Ezio_title), getString(R.string.Ezio_description), getString(R.string.Ezio_contact)));

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