package com.example.aahaarapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HistoryListAdapter extends RecyclerView.Adapter<HistoryListAdapter.ViewHolder> {

    ArrayList<HistoryData> mList;
    Context mContext;

    HistoryListAdapter(Context context, List historyList){
        mList = new ArrayList<>(historyList);
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.history_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView type;
        TextView desc;

        Button delete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.historyName);
            type = itemView.findViewById(R.id.historyType);
            desc = itemView.findViewById(R.id.historyDes);
            delete = itemView.findViewById(R.id.historyDelete);
        }

        void bind(HistoryData data){
            name.setText(data.getName());
            type.setText(data.getType());
            desc.setText(data.getDescription());

            delete.setOnClickListener(view -> {

            });
        }
    }
}
