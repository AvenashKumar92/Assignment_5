package com.example.avenash_2.resume;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class WorkExperienceFragment extends Fragment {
    ListView lvVDExperience;
    ListView lvMatrixSystemsExperience;
    ListView lvITSecurityLabsExperience;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work_experience,container,false);
        lvVDExperience=view.findViewById(R.id.lvVDExperience);
        lvVDExperience.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(), getResources().getStringArray(R.array.vdExperience)));

        lvMatrixSystemsExperience=view.findViewById(R.id.lvMatrixSystemExperience);
        lvMatrixSystemsExperience.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(), getResources().getStringArray(R.array.matrixSystemsExperience)));


        lvITSecurityLabsExperience=view.findViewById(R.id.lvITSecurityLabsExperience);
        lvITSecurityLabsExperience.setAdapter(ListViewUtility.getInstance().createAdapter(getActivity(), getResources().getStringArray(R.array.itSecurityLabsExperience)));

        return view;
    }
}
