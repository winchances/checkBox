package com.example.wenc.listviewcheckboxdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        ListView lv= (ListView) findViewById(R.id.lv);

        MyAdapter adapter=new MyAdapter(this,list);
        lv.setAdapter(adapter);

    }

    private void initData() {
        if(list==null){
            list=new ArrayList<>();
            for (int i = 0; i <50 ; i++) {
                list.add("This is a test  "+i);
            }
        }
    }
}
