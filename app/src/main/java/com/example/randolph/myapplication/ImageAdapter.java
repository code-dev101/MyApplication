package com.example.randolph.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by user on 1/27/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        this.mContext = c;

    }

    @Override
    public int getCount() {
        return catalog.listOfItem.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int postion, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5,5,5,5);

        }else{
            imageView = (ImageView) view;
        }

        imageView.setImageResource(catalog.listOfItem[postion]);
        return imageView;
    }



}
