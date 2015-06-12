package com.example.angelbernal.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button mSpotifyStreamerButton,
            mScoresAppButton,
            mLibraryAppButton,
            mBuiltItBiggerButton,
            mXyzReaderButton,
            mCapstoneButton;

    CharSequence text;
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyStreamerButton = (Button)findViewById(R.id.spotify_streamer_button);
        mSpotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = getString(R.string.general_toast) + " " + getString(R.string.spotify_streamer_toast);
                Toast toast = Toast.makeText(getApplication(), text, duration);
                toast.show();
            }
        });

        mScoresAppButton = (Button)findViewById(R.id.scores_app_button);
        mScoresAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = getString(R.string.general_toast) + " " + getString(R.string.scores_toast);
                Toast toast = Toast.makeText(getApplication(), text, duration);
                toast.show();            }
        });

        mLibraryAppButton = (Button)findViewById(R.id.library_app_button);
        mLibraryAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = getString(R.string.general_toast) + " " + getString(R.string.library_toast);
                Toast toast = Toast.makeText(getApplication(), text, duration);
                toast.show();            }
        });

        mBuiltItBiggerButton = (Button)findViewById(R.id.built_it_bigger_button);
        mBuiltItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = getString(R.string.general_toast) + " " + getString(R.string.built_it_bigger_toast);
                Toast toast = Toast.makeText(getApplication(), text, duration);
                toast.show();            }
        });

        mXyzReaderButton = (Button)findViewById(R.id.xyz_reader_button);
        mXyzReaderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = getString(R.string.general_toast) + " " + getString(R.string.xyz_reader_toast);
                Toast toast = Toast.makeText(getApplication(), text, duration);
                toast.show();            }
        });

        mCapstoneButton = (Button)findViewById(R.id.capstone_my_own_app_button);
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text = getString(R.string.general_toast) + " " + getString(R.string.capstone_my_own_app_toast);
                Toast toast = Toast.makeText(getApplication(), text, duration);
                toast.show();            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
