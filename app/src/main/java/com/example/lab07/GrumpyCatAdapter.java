package com.example.lab07;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class GrumpyCatAdapter extends RecyclerView.Adapter<GrumpyCatAdapter.CatHolder> {

    private final List<GrumpyCat> cats;

    public GrumpyCatAdapter(List<GrumpyCat> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_cat, parent, false);
        return new CatHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CatHolder holder, int position) {
        GrumpyCat grumpyCat = cats.get(position);

        Picasso.get().load(grumpyCat.getImage()).into(holder.image);
        holder.name.setText(grumpyCat.getName());
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    static class CatHolder extends RecyclerView.ViewHolder {
        public final ImageView image;
        public final TextView name;

        public CatHolder(View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.item_image);
            this.name = itemView.findViewById(R.id.item_name);
        }
    }
}
