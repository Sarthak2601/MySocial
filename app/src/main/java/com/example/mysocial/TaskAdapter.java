package com.example.mysocial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    ArrayList<Task> db ;

    public TaskAdapter(ArrayList<Task> db){
        this.db = db ;


    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new TaskViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_donor_window,parent,false));
        // View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        // TaskViewHolder vie = new TaskViewHolder(v);
        // return vie;


    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {


        com.example.mysocial.Task currentTask = db.get(position);
        holder.cause.setText(currentTask.getCause());
        holder.date.setText(currentTask.getDate());
        holder.loc.setText(currentTask.getLocation());
        holder.req1.setText(currentTask.getRequirement1());
        holder.req2.setText(currentTask.getRequirement2());

    }

    @Override
    public int getItemCount() {
        return db.size();
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder{

        TextView cause;
        TextView date;
        TextView loc;
        TextView req1;
        TextView req2;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);

            cause = itemView.findViewById(R.id.cause);
            date = itemView.findViewById(R.id.date);
            loc = itemView.findViewById(R.id.editText2);
            req1 = itemView.findViewById(R.id.req1);
            req2 = itemView.findViewById(R.id.req2);

        }
    }}
