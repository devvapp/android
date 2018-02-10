package com.example.android.favoritetoys;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create EditText variable to refer the search edit text
    EditText mSearchBoxEditText;

    TextView mUrlDisplayTextView;


    TextView mSearchResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchBoxEditText = findViewById(R.id.et_search_box);
        mUrlDisplayTextView = findViewById(R.id.tv_url_display);
        mSearchResults = findViewById(R.id.tv_github_search_results_json);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menuItemThatWasSelected = item.getItemId();
        if(menuItemThatWasSelected == R.id.action_search){
            Context context = MainActivity.this;
            String message = "Search clicked";
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
