package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class GurudwaraFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.gone), getString(R.string.gone),R.drawable.gone));
        words.add(new Word(getString(R.string.gtwo), getString(R.string.gltwo), R.drawable.gtwo));
        words.add(new Word(getString(R.string.gthree), getString(R.string.glthree), R.drawable.gthree));
        words.add(new Word(getString(R.string.gfour), getString(R.string.glfour), R.drawable.gfour));
        words.add(new Word(getString(R.string.gfive), getString(R.string.glfive), R.drawable.gfive));
        words.add(new Word(getString(R.string.gsix), getString(R.string.glsix), R.drawable.gsix));
        words.add(new Word(getString(R.string.gseven), getString(R.string.glseven), R.drawable.gseven));
        words.add(new Word(getString(R.string.geight), getString(R.string.gleight), R.drawable.geight));

        wordAdapter adapter = new wordAdapter(getActivity(), words, R.color.category_guru);
        ListView listView = (ListView) rootView.findViewById(R.id.listitem);
        listView.setAdapter(adapter);
        return rootView;
    }
}