package com.example.staggeredviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;



public class MyCostumAdapter extends RecyclerView.Adapter<MyCostumAdapter.MyViewHolder> {
    Context context;
    List<RowModel> rowModelList;
    public MyCostumAdapter(Context context, List<RowModel> rowModelList) {
        this.context = context;
        this.rowModelList = rowModelList;
    }
    @NonNull
    @Override
    public MyCostumAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyCostumAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(rowModelList.get(position).getActorsImage()).into(holder.imageView);
        holder.textView.setText(rowModelList.get(position).getActorsName());
    }
    @Override
    public int getItemCount() {
        return rowModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.text);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            if(getLayoutPosition() == 0){
                Toast.makeText(context,"you clicked First item", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
