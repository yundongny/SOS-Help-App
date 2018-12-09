package com.example.will.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<StudyGroupItem> studyGroupItemList;
    public ListAdapter(StudyGroupItem[] List) {
        this.studyGroupItemList = new ArrayList<>(Arrays.asList(List));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StudyGroupItem item = studyGroupItemList.get(i);
        viewHolder.nameText.setText(item.getName());
        viewHolder.classText.setText(item.getName());
        viewHolder.timeText.setText(item.getName());
        viewHolder.numberOfPeopleText.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return studyGroupItemList.size();
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
            this.classText = itemView.findViewById(R.id.classTEXT);
            this.timeText = itemView.findViewById(R.id.timeTEXT);
            this.numberOfPeopleText = itemView.findViewById(R.id.peopleTEXT);
        }
    }
}
