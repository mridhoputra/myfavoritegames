package com.fairlight.submission.myfavoritegames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_games;
    private ArrayList<Game> list_games = new ArrayList<>();
    private ArrayList<Game> detailed_games = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("My Favorite Games (All Time)");
        }

        rv_games = findViewById(R.id.rv_games);
        rv_games.setHasFixedSize(true);
        list_games.addAll(GameData.getListData());
        detailed_games.addAll(GameData.getDetailedListData());

        rv_games.setLayoutManager(new LinearLayoutManager(this));
        CardViewGameAdapter cardViewGameAdapter = new CardViewGameAdapter(list_games,detailed_games);
        rv_games.setAdapter(cardViewGameAdapter);

        cardViewGameAdapter.setOnItemClickCallback(new CardViewGameAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Game detailed_game) {
                showDetailedGame(detailed_game);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_personal_profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.personal_profile:
                Intent moveIntent = new Intent(MainActivity.this, Activity_Personal_Profile.class);
                startActivity(moveIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void showDetailedGame(Game detailed_game){
        Intent moveWithDataIntent = new Intent(MainActivity.this, Activity_DetailedGame.class);
        moveWithDataIntent.putExtra("DETAILED_GAME", detailed_game);
        startActivity(moveWithDataIntent);
    }
}
