package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.mone), getString(R.string.mlone), R.drawable.mone));
        words.add(new Word(getString(R.string.mtwo), getString(R.string.mltwo), R.drawable.mtwo));
        words.add(new Word(getString(R.string.mthree), getString(R.string.mlthree), R.drawable.mthree));
        words.add(new Word(getString(R.string.mfour), getString(R.string.mlfour), R.drawable.mfour));
        words.add(new Word(getString(R.string.mfive), getString(R.string.mlfive), R.drawable.mfive));

        wordAdapter adapter = new wordAdapter(getActivity(), words, R.color.category_market);
        ListView listView = (ListView) rootView.findViewById(R.id.listitem);
        listView.setAdapter(adapter);
        return rootView;
    }
}