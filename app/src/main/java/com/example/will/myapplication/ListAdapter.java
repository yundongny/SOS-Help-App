package com.example.will.myapplication;

import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    public ListAdapter() {
        super();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView nameText;
        public TextView classText;
        public TextView timeText;
        public TextView numberOfPeopleText;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            this.nameText = itemView.findViewById(R.id.nameTEXT);
            this.classText = itemView.findViewbyId(R.id.classTEXT);
            this.timeText = itemView.findViewById(R.id.timeTEXT);
            this.numberOfPeopleText = itemView.findViewById(R.id.peopleTEXT);
        }
    }
}
