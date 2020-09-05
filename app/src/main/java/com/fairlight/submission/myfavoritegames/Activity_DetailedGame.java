package com.fairlight.submission.myfavoritegames;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Activity_DetailedGame extends AppCompatActivity implements Serializable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvGameName, tvGameQuote, tvGameDeveloper, tvGamePlatform, tvGameReleaseDate, tvGameGenre, tvGameDescription;
        ImageView imgBigPhoto, imgGameIcon, imgGameScreenshot;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // Toolbar :: Transparent
        toolbar.setBackgroundColor(Color.TRANSPARENT);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Game game = (Game) getIntent().getExtras().getSerializable("DETAILED_GAME");

        tvGameName = findViewById(R.id.tv_item_game_name);
        tvGameQuote = findViewById(R.id.tv_item_quote);
        tvGameDeveloper = findViewById(R.id.tv_item_developer);
        tvGamePlatform = findViewById(R.id.tv_item_avalaible_platform);
        tvGameReleaseDate = findViewById(R.id.tv_item_release_date);
        tvGameGenre = findViewById(R.id.tv_item_genre);
        tvGameDescription = findViewById(R.id.tv_item_game_description);
        imgBigPhoto = findViewById(R.id.image_item_game_bigsize);
        imgGameIcon = findViewById(R.id.image_item_game_round);
        imgGameScreenshot = findViewById(R.id.image_item_game_screenshot);

        imgBigPhoto.setImageResource(game.getPhoto_bigsize());
        imgGameIcon.setImageResource(game.getPhoto_round());
        tvGameName.setText(game.getName());
        tvGameQuote.setText(game.getQuote());
        tvGameDeveloper.setText(game.getDeveloper());
        tvGamePlatform.setText(game.getAvailable_platform());
        tvGameReleaseDate.setText(game.getRelease_date());
        tvGameGenre.setText(game.getGenre());
        tvGameDescription.setText(game.getGame_description());
        imgGameScreenshot.setImageResource(game.getPhoto_game_screenshot());
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
