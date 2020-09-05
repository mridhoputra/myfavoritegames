package com.fairlight.submission.myfavoritegames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DetailedGameAdapter extends RecyclerView.Adapter<DetailedGameAdapter.DetailedGameViewHolder> {
    private ArrayList<Game> listdetailedGame;

    public DetailedGameAdapter(ArrayList<Game> list){
        this.listdetailedGame = list;
    }

    @NonNull
    @Override
    public DetailedGameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_game_detail, viewGroup,false);
        return new DetailedGameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DetailedGameViewHolder holder, int position) {
        Game game =listdetailedGame.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listdetailedGame.get(position).getPhoto())
                .into(holder.imgBigPhoto);
        Glide.with(holder.itemView.getContext())
                .load(listdetailedGame.get(position).getPhoto())
                .into(holder.imgGameIcon);
        holder.tvGameName.setText(game.getName());
        holder.tvGameQuote.setText(game.getQuote());
        holder.tvGamePlatform.setText(game.getAvailable_platform());
        holder.tvGameReleaseDate.setText(game.getRelease_date());
        holder.tvGameGenre.setText(game.getGenre());
        holder.tvGameDescription.setText(game.getGame_description());
        Glide.with(holder.itemView.getContext())
                .load(listdetailedGame.get(position).getPhoto())
                .into(holder.imgGameScreenshot);
    }

    @Override
    public int getItemCount() {
        return listdetailedGame.size();
    }

    public class DetailedGameViewHolder extends RecyclerView.ViewHolder {
        TextView tvGameName, tvGameQuote, tvGamePlatform, tvGameReleaseDate, tvGameGenre, tvGameDescription;
        ImageView imgBigPhoto, imgGameIcon, imgGameScreenshot;
        public DetailedGameViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGameName = itemView.findViewById(R.id.tv_item_game_name);
            tvGameQuote = itemView.findViewById(R.id.tv_item_quote);
            tvGamePlatform = itemView.findViewById(R.id.tv_item_avalaible_platform);
            tvGameReleaseDate = itemView.findViewById(R.id.tv_item_release_date);
            tvGameGenre = itemView.findViewById(R.id.tv_item_genre);
            tvGameDescription = itemView.findViewById(R.id.tv_item_game_description);
            imgBigPhoto = itemView.findViewById(R.id.image_item_game_bigsize);
            imgGameIcon = itemView.findViewById(R.id.image_item_game_round);
            imgGameScreenshot = itemView.findViewById(R.id.image_item_game_screenshot);
        }
    }
}
