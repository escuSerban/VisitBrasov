package com.example.p7visitbrasov;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * {@link Fragment} that displays a slideShow, a description and button for a youTube video.
 */
public class OverviewFragment extends Fragment {
    /**
     * Handles the video presentation.
     */
    private Button presentation;

    /**
     * Handles the slideShow
     */
    private ViewFlipper photoFlipper;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /** Using a getView method to find button's source */
        presentation = getView().findViewById(R.id.youTube_presentation);

        /** Set a click listener to use the youTube intent. */
        presentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/watch?v=xwNtlYX_iYM&t=1s";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        /** Using a getView method to find flipper's source */
        photoFlipper = getView().findViewById(R.id.view_flipper);

        /** Creating an Array of images for our flipper */
        int photos[] = {R.drawable.councilsquare, R.drawable.squareview, R.drawable.streetview, R.drawable.aerialview, R.drawable.aboveview,};

        /** Setting up a for loop to keep images sliding */
        for (int i = 0; i < photos.length; i++) {
            flipperPhotos(photos[i]);
        }

        /** An important if statement to prevent slideshow from crashing */
        if (savedInstanceState == null) {
            photoFlipper.startFlipping();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_overview, container, false);
    }

    public void flipperPhotos(int photo) {
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(photo);

        /** Setting the way flipper behaves */
        photoFlipper.addView(imageView);
        photoFlipper.setFlipInterval(3000);
        photoFlipper.setAutoStart(true);
        photoFlipper.setInAnimation(getActivity(), android.R.anim.slide_in_left);
        photoFlipper.setOutAnimation(getActivity(), android.R.anim.slide_out_right);
    }
}