package com.example.avenash_2.resume;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import static com.example.avenash_2.resume.R.layout;

/**
 * Created by rMohanraj on 4/18/2017.
 */


public class HomeFragment extends Fragment {

    ListView lvAchievements;
    ListView lvPortfolio;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(layout.home_fragment,container,false);
        lvAchievements=view.findViewById(R.id.lvAchievements);
        lvAchievements.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(), getResources().getStringArray(R.array.achievements)));

        lvPortfolio=view.findViewById(R.id.lvPortfolio);
        lvPortfolio.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(), getResources().getStringArray(R.array.portfolios)));
        return view;
    }
}

