package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.rone), getString(R.string.rlone), R.drawable.rone));
        words.add(new Word(getString(R.string.rtwo), getString(R.string.rltwo), R.drawable.rtwo));
        words.add(new Word(getString(R.string.rthree), getString(R.string.rlthree), R.drawable.rthree));
        words.add(new Word(getString(R.string.rfour), getString(R.string.rlfour), R.drawable.rfour));
        words.add(new Word(getString(R.string.rfive), getString(R.string.rlfive), R.drawable.rfive));
        words.add(new Word(getString(R.string.rsix), getString(R.string.rlsix), R.drawable.rsix));
        words.add(new Word(getString(R.string.rseven), getString(R.string.rlseven), R.drawable.rseven));
        words.add(new Word(getString(R.string.reight), getString(R.string.rleight), R.drawable.reight));

        wordAdapter adapter = new wordAdapter(getActivity(), words, R.color.category_rest);
        ListView listView = (ListView) rootView.findViewById(R.id.listitem);
        listView.setAdapter(adapter);
        return rootView;
    }
}