package edu.calvin.cs262.climbinglogappprototype;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:  //If the search button was pressed, call the correct method
                openSearch();
                return true;
            case R.id.action_settings:  //Do the same thing if it was the settings button
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Taken from the lab
    //Search method
    private void openSearch(){
        startActivity(new Intent(SearchManager.INTENT_ACTION_GLOBAL_SEARCH));
    }

    //Settings method
    private void openSettings(){
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }

    /**
     * This will start up the activity that has the stats activity.
     */
    public void startLogger(View view) {
        Intent myIntent = new Intent(MainActivity.this, ClimbLogger.class);
        MainActivity.this.startActivity(myIntent);
    }

    /**
     * This will start up the activity that has the gear list.
     */
    public void startGearList(View view) {
        Intent myIntent = new Intent(MainActivity.this, GearList.class);
        MainActivity.this.startActivity(myIntent);
    }
}
