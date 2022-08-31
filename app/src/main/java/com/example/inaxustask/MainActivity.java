package com.example.inaxustask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.inaxustask.models.IssuesDetails;
import com.example.inaxustask.network.responses.IssuesList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    IssuesDetails issuesDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        recyclerAdapter=new RecyclerAdapter(getApplicationContext(), (List<IssuesList>) issuesDetails);

        recyclerView.setAdapter(recyclerAdapter);





    }
}