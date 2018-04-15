package com.example.avenash_2.resume;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class AboutMeFragment extends Fragment {

    ListView lvEducation;
    ListView lvTechSkills;
    ListView lvSoftSkills;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_me,container,false);
        lvEducation=view.findViewById(R.id.lvEducation);
        lvTechSkills=view.findViewById(R.id.lvTechSkills);
        lvSoftSkills=view.findViewById(R.id.lvSoftSkills);

        lvEducation.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(), getResources().getStringArray(R.array.educationInfo)));

        lvTechSkills.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(),getResources().getStringArray(R.array.techSkills)));

        lvSoftSkills.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(),getResources().getStringArray(R.array.techSkills)));

        return view;
    }


}