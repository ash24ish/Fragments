package com.ashishbharam.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InactiveListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InactiveListFragment extends Fragment {

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

    public InactiveListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InactiveListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InactiveListFragment newInstance(String param1, String param2) {
        InactiveListFragment fragment = new InactiveListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public static InactiveListFragment newInstance() {
        InactiveListFragment fragment = new InactiveListFragment();

        return fragment;
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
        View view = inflater.inflate(R.layout.fragment_inactive_list, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mNameList.add("Ashish Bharam");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        mNameList.add("Akshay Mhaske");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        mNameList.add("Vishal Gade");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        mNameList.add("Mandy");
        mNameList.add("9632587410");
        mNameList.add("Developer");

        recyclerView = view.findViewById(R.id.rv_inactiveList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RVAdapter(view.getContext(), mNameList);
        recyclerView.setAdapter(adapter);
    }
}