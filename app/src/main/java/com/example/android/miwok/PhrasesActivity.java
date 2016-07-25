/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
public MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);






        final ArrayList <Word>  words = new ArrayList<Word>();
        words.add (new Word ("Where are you going","minto wuksus",R.raw.phrase_where_are_you_going));
        words.add (new Word ("What`is your name" ,"tinna oyaase'na",R.raw.phrase_what_is_your_name));
        words.add (new Word ("My name is ...","oyaaset ",R.raw.phrase_my_name_is));
        words.add (new Word ("how are you feeling ?" ,"michakaas",R.raw.phrase_how_are_you_feeling));
        words.add (new Word ("im feeling good" ,"kuchi achit",R.raw.phrase_im_feeling_good));
        words.add (new Word ("Are you coming ? " ,"aanas'aa?",R.raw.phrase_are_you_coming));
        words.add (new Word ("i'm coming" ,"haaaam",R.raw.phrase_im_coming));
        words.add (new Word ("lets go" ,"yoowutis",R.raw.phrase_lets_go));
        words.add (new Word ("come here" ,"anniem",R.raw.phrase_come_here));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.

        WordAdapter adapter = new WordAdapter(this, words );
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}




