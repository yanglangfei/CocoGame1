package com.ylf.jucaipen.cocogame1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.ylf.jucaipen.cocogame1.R;
import com.ylf.jucaipen.cocogame1.model.Person;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
public class MyAdapter extends BaseAdapter {
    private final List<Person> persons;
    private final Context context;

    public MyAdapter(List<Person> persons, Context context) {
        this.persons=persons;
        this.context=context;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return persons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
         convertView= LayoutInflater.from(context).inflate(R.layout.ui_item,null);
            holder=new ViewHolder();
            holder.logo= (ImageView) convertView.findViewById(R.id.logo);
            holder.name= (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        holder.name.setText(persons.get(position).getName());
        BitmapUtils utils=new BitmapUtils(context);
        utils.display(holder.logo,persons.get(position).getLogoPath());
        return convertView;
    }

    class  ViewHolder{
        ImageView logo;
        TextView name;
    }
}
