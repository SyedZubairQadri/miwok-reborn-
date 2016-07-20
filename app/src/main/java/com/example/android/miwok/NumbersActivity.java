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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_numbers);

           ArrayList <Word>  words = new ArrayList<Word>();
           words.add (new Word ("one" ,"lutti"));
           words.add (new Word ("two" ,"otiiko"));
           words.add (new Word ("three" ,"tolookosu"));
           words.add (new Word ("four" ,"oyyisa"));
           words.add (new Word ("five" ,"massoka"));
           words.add (new Word ("six" ,"temmokka"));
           words.add (new Word ("seven" ,"kenekaku"));
           words.add (new Word ("eight" ,"kawinta"));
           words.add (new Word ("nine" ,"wo 'e"));
           words.add (new Word ("ten" ,"na 'acha"));
           // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
           // adapter knows how to create list items for each item in the list.

           WordAdapter adapter = new WordAdapter(this, words);
           // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
           // There should be a {@link ListView} with the view ID called list, which is declared in the
           // activity_numbers.xml layout file.

           ListView listView = (ListView) findViewById(R.id.list);


           // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
           // {@link ListView} will display list items for each {@link Word} in the list.
           listView.setAdapter(adapter);

       }     //   Log.v("NumbersActivity","words at index 0:" + words.get(1));
    // Log.v("NumbersActivity","words at index 1:" + words.get(2));
    //Log.v("NumbersActivity","words at index 2:" + words.get(3));
    //Log.v("NumbersActivity","words at index 3:" + words.get(4));
    // Log.v("NumbersActivity","words at index 4:" + words.get(5));
    // Log.v("NumbersActivity","words at index 5:" + words.get(6));
    // Log.v("NumbersActivity","words at index 6:" + words.get(7));
       // Log.v("NumbersActivity","words at index 7:" + words.get(8));
    }


