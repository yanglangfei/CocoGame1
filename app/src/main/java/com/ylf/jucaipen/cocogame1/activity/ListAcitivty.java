package com.ylf.jucaipen.cocogame1.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.ylf.jucaipen.cocogame1.R;
import com.ylf.jucaipen.cocogame1.adapter.MyAdapter;
import com.ylf.jucaipen.cocogame1.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
public class ListAcitivty extends Activity {
    private ListView list;
    private MyAdapter adapter;
    private List<Person> persons=new ArrayList<>();
    private Context context=ListAcitivty.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_list);
        ActivityManager manager= (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        int memory=manager.getMemoryClass();
        initView();
        initData();
    }

    private void initData() {
        for(int i=0;i<20;i++) {
            persons.add(new Person("张三", "http://avatar.csdn.net/F/F/3/3_yi_zz32.jpg"));
            persons.add(new Person("李四", "http://avatar.csdn.net/B/D/C/3_sleks.jpg"));
            persons.add(new Person("王五", "http://avatar.csdn.net/8/F/D/3_sunqunsunqun.jpg"));
            persons.add(new Person("赵六", "http://avatar.csdn.net/4/B/E/3_qq_16064871.jpg"));
        }
        adapter.notifyDataSetChanged();
    }

    private void initView() {
        list= (ListView) findViewById(R.id.list);
        adapter=new MyAdapter(persons,context);
        list.setAdapter(adapter);
    }
}
