package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.sone), getString(R.string.slone), R.drawable.sone));
        words.add(new Word(getString(R.string.stwo), getString(R.string.sltwo), R.drawable.stwo));
        words.add(new Word(getString(R.string.sthree), getString(R.string.slthree), R.drawable.sthree));
        words.add(new Word(getString(R.string.sfour),getString(R.string.slfour), R.drawable.sfour));
        words.add(new Word(getString(R.string.sfive), getString(R.string.slfive), R.drawable.sfive));
        words.add(new Word(getString(R.string.ssix), getString(R.string.slsix), R.drawable.ssix));

        wordAdapter adapter = new wordAdapter(getActivity(), words, R.color.category_sight);
        ListView listView = (ListView) rootView.findViewById(R.id.listitem);
        listView.setAdapter(adapter);
        return rootView;
    }
}