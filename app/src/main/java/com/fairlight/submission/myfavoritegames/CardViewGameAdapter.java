package com.fairlight.submission.myfavoritegames;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewGameAdapter extends RecyclerView.Adapter<CardViewGameAdapter.CardViewViewHolder> {
    private ArrayList<Game>list_games;
    private ArrayList<Game>detailed_games;
    private OnItemClickCallback onItemClickCallback;

    public CardViewGameAdapter(ArrayList<Game> list_games, ArrayList<Game> detailed_games){
        this.list_games = list_games;
        this.detailed_games = detailed_games;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_games, viewGroup,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        Game game = list_games.get(position);
        final Game detailed_game = detailed_games.get(position);

        Glide.with(holder.itemView.getContext())
                .load(game.getPhoto())
                .into(holder.imgPhoto);
        holder.tv_name.setText(game.getName());
        holder.tv_first_impression.setText(game.getFirst_impression());
        holder.tv_played_since.setText(game.getPlayed_since());
        holder.tv_platform.setText(game.getPlatform());
        holder.tv_genre.setText(game.getGenre());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                onItemClickCallback.onItemClicked(detailed_game);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list_games.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tv_name, tv_first_impression, tv_played_since,tv_platform, tv_genre;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_item_game);
            tv_name = itemView.findViewById(R.id.tv_item_game_name);
            tv_first_impression = itemView.findViewById(R.id.tv_item_first_impression);
            tv_played_since = itemView.findViewById(R.id.tv_item_played_since);
            tv_platform = itemView.findViewById(R.id.tv_item_platform);
            tv_genre = itemView.findViewById(R.id.tv_item_genre);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Game detailed_game);
    }
}
