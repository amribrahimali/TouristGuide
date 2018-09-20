package com.example.android.touristguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by El.masry on 04/02/2018.
 */

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.list, new EventsFragment())
                .commit();
    }
}
