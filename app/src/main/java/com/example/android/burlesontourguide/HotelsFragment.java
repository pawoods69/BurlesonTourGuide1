package com.example.android.burlesontourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


//**
// * A simple {@link Fragment} subclass.
// */

public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.hotels_best_western, R.string.number_best_western,
                R.drawable.bestwestern));
        words.add(new Word(R.string.hotels_la_quinta, R.string.number_la_quinta,
                R.drawable.laquinta));
        words.add(new Word(R.string.hotels_holiday, R.string.number_holiday,
                R.drawable.holidayinn));
        words.add(new Word(R.string.hotels_hampton, R.string.number_hampton,
                R.drawable.hamptoninn));
        words.add(new Word(R.string.hotels_days, R.string.number_days,
                R.drawable.daysinn));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}

