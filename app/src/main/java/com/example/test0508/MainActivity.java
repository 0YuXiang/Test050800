package com.example.test0508;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView = findViewById(R.id.rvMyData);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<StuData> stuDataList = new ArrayList<>();
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "John", "180"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "John", "180"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Tom", "175"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Jerry", "170"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Mike", "165"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Jack", "160"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Rose", "155"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Lily", "150"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Lucy", "145"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Linda", "140"));
        stuDataList.add(new StuData("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Marry", "135"));
        recyclerView.setAdapter(new StuDataAdapter(stuDataList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }



    public void mainActivity2(View view) {
        Intent intent = new Intent(this, mainActivity2.class);
        startActivityForResult(intent, 1);
    }

}