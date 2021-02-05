package com.ashishbharam.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ActiveListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActiveListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private RecyclerView recyclerView;
    private RVAdapter adapter;
    private ArrayList<String> mNameList = new ArrayList<>();

    public ActiveListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ActiveListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActiveListFragment newInstance(String param1, String param2) {
        ActiveListFragment fragment = new ActiveListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public static ActiveListFragment newInstance() {

        return new ActiveListFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_active_list, container, false);

        TextView active = view.findViewById(R.id.tvActive);

        active.setOnClickListener(v -> {

        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mNameList.add("Ashish Bharam Active");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        mNameList.add("Akshay Mhaske Active");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        mNameList.add("Vishal Gade Active");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        mNameList.add("Mandy Active");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        recyclerView = view.findViewById(R.id.rv_activeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RVAdapter(view.getContext(), mNameList);
        //adapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
        recyclerView.setAdapter(adapter);


    }
}