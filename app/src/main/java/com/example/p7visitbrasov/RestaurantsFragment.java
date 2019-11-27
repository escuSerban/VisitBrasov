package com.example.p7visitbrasov;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.p7visitbrasov.RestaurantsFragments.GroupsFragment;
import com.example.p7visitbrasov.RestaurantsFragments.LocalCuisineFragment;
import com.example.p7visitbrasov.RestaurantsFragments.RomanticFragment;
import com.google.android.material.tabs.TabLayout;

/**
 * {@link Fragment} that has 3 subFragments and displays 3 lists of restaurants.
 */
public class RestaurantsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_second, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /** Find the view pager that will allow the user to swipe between fragments */
        ViewPager viewPager = getView().findViewById(R.id.view_pager);

        /** Create an adapter that knows which fragments should be shown on each page */
        RestaurantsAdapter adapterR = new RestaurantsAdapter(getActivity(), getChildFragmentManager());

        /** Set the adapter onto the view pager */
        viewPager.setAdapter(adapterR);

        /** Find the tab layout that shows the tabs */
        TabLayout tabLayout = getView().findViewById(R.id.tabs);

        /** Connect the tab layout with the view pager. This will
         * 1. Update the tab layout when the view pager is swiped
         * 2. Update the view pager when a tab is selected
         * 3. Set the tab layout's tab names with the view pager's adapter's titles
         * by calling onPageTitle() */
        tabLayout.setupWithViewPager(viewPager);
    }

    private class RestaurantsAdapter extends FragmentPagerAdapter {
        /**
         * Context of the app.
         */
        private Context mContext;

        /**
         * Create a new {@link RestaurantsAdapter} object.
         *
         * @param context is the context of the app
         * @param fm      is the fragment manager that will keep each fragment's state in the adapter
         *                across swipes.
         */
        private RestaurantsAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        /**
         * Overriding this method will get our 3 subFragments in the right position.
         */
        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new RomanticFragment();
            } else if (position == 1) {
                return new LocalCuisineFragment();
            } else {
                return new GroupsFragment();
            }
        }

        /**
         * Called to set how many items are represented by RestaurantsAdapter.
         */
        @Override
        public int getCount() {
            return 3;
        }

        /**
         * Provides titles for our subFragments.
         */
        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return mContext.getString(R.string.category_romantic);
            } else if (position == 1) {
                return mContext.getString(R.string.category_local);
            } else {
                return mContext.getString(R.string.category_groups);
            }
        }
    }
}
