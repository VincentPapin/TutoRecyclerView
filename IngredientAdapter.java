package com.ginkgosoft.tutorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IngredientAdapter extends RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder> {

    List<Ingredient> listeIngredient;

    public static class IngredientViewHolder extends RecyclerView.ViewHolder{
        TextView nom;
        TextView quantite;
        public IngredientViewHolder(@NonNull View itemView) {
            super(itemView);
            nom = itemView.findViewById(R.id.nom);
            quantite = itemView.findViewById(R.id.quantite);
        }
    }

    public IngredientAdapter(List<Ingredient> listeIngredient) {
        this.listeIngredient = listeIngredient;
    }

    @NonNull
    @Override
    public IngredientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_ingredient,parent,false);
        IngredientViewHolder ingredientViewHolder = new IngredientViewHolder(view);
        return ingredientViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientViewHolder holder, int position) {
        Ingredient ingredient = listeIngredient.get(position);
        holder.nom.setText(ingredient.getNom());
        holder.quantite.setText(ingredient.getQuantite());
    }

    @Override
    public int getItemCount() {
        return listeIngredient.size();
    }


}
