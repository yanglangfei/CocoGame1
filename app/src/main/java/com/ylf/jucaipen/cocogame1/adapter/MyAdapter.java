package com.ylf.jucaipen.cocogame1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
    private final BitmapUtils utils;
    private   float mScreenWidth;
    private  float mScreenHeught;
    private int width;

    public MyAdapter(List<Person> persons, Context context) {
         utils=new BitmapUtils(context);
        this.persons=persons;
        this.context=context;
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        mScreenWidth=wm.getDefaultDisplay().getWidth();
        mScreenHeught=wm.getDefaultDisplay().getHeight();
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
            holder.parent= (RelativeLayout) convertView.findViewById(R.id.parent);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        holder.name.setText(persons.get(position).getName());
        utils.display(holder.logo, persons.get(position).getLogoPath());
        width=0;
        for(int i=0;i<100;i++){
            ImageView imageView=new ImageView(context);
            imageView.setId(i);
            //设置间距
            RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(200,200);
            params.setMargins(10, 10, 10, 10);
            utils.display(imageView, persons.get(position).getLogoPath());
            //220*5=1100
             width+=(imageView.getWidth()+params.leftMargin+params.rightMargin);
            if(i>0) {
                if ( mScreenWidth%width!=0) {
                    //进行换行
                    width=0;
                    params.addRule(RelativeLayout.BELOW, i - 1);
                } else {
                    //平移
                    params.addRule(RelativeLayout.RIGHT_OF, i - 1);
                }
            }
            holder.parent.addView(imageView, params);
        }
        return convertView;
    }

    class  ViewHolder{
        ImageView logo;
        TextView name;
        RelativeLayout parent;
    }
}
