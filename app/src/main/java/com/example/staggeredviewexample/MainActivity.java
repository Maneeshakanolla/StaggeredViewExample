package com.example.staggeredviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyCostumAdapter myCostumAdapter;
    RecyclerView recyclerView;
    List<RowModel> rowModelList;
    StaggeredGridLayoutManager manager;

    int[] images=new int[]{
            R.drawable.fashion1,
            R.drawable.blue,
            R.drawable.fashion2,
            R.drawable.purple,
            R.drawable.fashion1,
            R.drawable.fashion1,
            R.drawable.fashion1,
            R.drawable.fashion1,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleview);

        rowModelList = new ArrayList<>();
        myCostumAdapter = new MyCostumAdapter(this, rowModelList);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(manager);

        recyclerView.setAdapter(myCostumAdapter);
        InitializeData();
    }

    private void InitializeData(){

        RowModel rowModel = new RowModel(images[0],"saree ");
        rowModelList.add(rowModel);

        RowModel rowModel1 = new RowModel(images[1],"blue");
        rowModelList.add(rowModel1);

        RowModel rowModel2 = new RowModel(images[2],"mahi");
        rowModelList.add(rowModel2);

        RowModel rowModel3 = new RowModel(images[3],"purple dress");
        rowModelList.add(rowModel3);

        RowModel rowModel4 = new RowModel(images[4],"xyz");
        rowModelList.add(rowModel4);

        RowModel rowModel5 = new RowModel(images[5],"aaa");
        rowModelList.add(rowModel5);

        RowModel rowModel6 = new RowModel(images[5],"aaa");
        rowModelList.add(rowModel6);

        RowModel rowModel7 = new RowModel(images[7],"aaa");
        rowModelList.add(rowModel7);




        myCostumAdapter.notifyDataSetChanged();
    }
}