package com.example.basicquranicapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Para extends Fragment {

    //ListView paralist;
    public String[] ParahName = {
            "الم ",
            "سیقول ",
            "تلک الرسل ",
            "لن تنالوالبر",
            "والمحصنت",
            "لایحب اللہ ",
            "واذاسمعوا",
            "ولواننا",
            "قال الملاء",
            "واعلموا",
            "یعتذرون ",
            "ومامن دآبۃ",
            "وماابرئ",
            "ربما",
            "سبحن الذی ",
            "قال الم ",
            "اقترب للناس",
            "قد افلح",
            "وقال الذین ",
            "امن خلق",
            "اتل مااوحی",
            "ومن یقنت ",
            "ومالی ",
            "فمن اظلم ",
            "الیہ یرد",
            "حم ",
            "قال فماخطبکم ",
            "قدسمع اللہ ",
            "تبارک الذی ",
            "عم یتسآءلون ",
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ListView paralist =(ListView) view.findViewById(R.id.myparalistview);
//
//        ArrayAdapter<String> paraadapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_dropdown_item_1line,ParahName);
//
//
//        paralist.setAdapter(paraadapter);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_para, container, false);

    }
    @Override
    public void onViewCreated(View view, @NonNull Bundle savedInstanceState){
        ListView paralist =(ListView) getView().findViewById(R.id.myparalistview);

        ArrayAdapter<String> paraadapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_dropdown_item_1line,ParahName);


        paralist.setAdapter(paraadapter);

    }
}