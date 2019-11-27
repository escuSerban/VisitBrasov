package com.example.p7visitbrasov;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContentsAdapter extends RecyclerView.Adapter<ContentsAdapter.ContentsViewHolder> {
    /**
     * Handles the list of contents.
     */
    private ArrayList<Contents> mContents;

    /**
     * Declaring the views for ViewHolder.
     */
    public static class ContentsViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titleTextView;
        public TextView descriptionTextView;
        public TextView contactTextView;

        /**
         * Finding the views within our itemView holder.
         */
        public ContentsViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            titleTextView = itemView.findViewById(R.id.title_text_view);
            descriptionTextView = itemView.findViewById(R.id.description_text_view);
            contactTextView = itemView.findViewById(R.id.contact_text_view);
        }
    }

    /**
     * Create a new {@link ContentsAdapter} object.
     */
    public ContentsAdapter(ArrayList<Contents> contents) {
        mContents = contents;
    }

    @Override
    public ContentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ContentsViewHolder cvh = new ContentsViewHolder(v);
        return cvh;
    }

    /**
     * Calling this method will ensure our recycling process and binding of new data.
     */
    @Override
    public void onBindViewHolder(ContentsViewHolder holder, int position) {
        Contents currentContent = mContents.get(position);

        holder.imageView.setImageResource(currentContent.getImageResourceId());
        holder.titleTextView.setText(currentContent.getTitle());
        holder.descriptionTextView.setText(currentContent.getDescription());
        holder.contactTextView.setText(currentContent.getContact());
    }

    /**
     * Return the total number of fragments.
     */
    @Override
    public int getItemCount() {
        return mContents.size();
    }
}
