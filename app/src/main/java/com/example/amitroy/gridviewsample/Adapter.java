package com.example.amitroy.gridviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AMIT ROY on 17-May-17.
 */

public class Adapter extends BaseAdapter {
    int[]icon;
    String[]iconname;
    Context context;
    LayoutInflater inflater;
    public  Adapter(Context context, int[] icon, String[] iconname){
        this.context=context;
        this.icon=icon;
        this.iconname=iconname;
    }
    @Override
    public int getCount() {
        return iconname.length;
    }

    @Override
    public Object getItem(int position) {
        return iconname[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.grid_view,null);
        }
        ImageView img=(ImageView)convertView.findViewById(R.id.img);
        TextView txt= (TextView)convertView.findViewById(R.id.tex);
        txt.setText(iconname[position]);
        img.setImageResource(icon[position]);
        img.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        img.setScaleX(1.0f);
        img.setScaleY(1.0f);
        txt.setScaleX(1.0f);
        txt.setScaleY(1.0f);
        return convertView;
    }
}
