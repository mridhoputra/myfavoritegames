package com.fairlight.submission.myfavoritegames;


import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;


import androidx.appcompat.app.AppCompatActivity;

public class Activity_Personal_Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("About Me");
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
