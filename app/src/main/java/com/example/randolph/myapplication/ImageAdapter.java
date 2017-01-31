package com.example.randolph.myapplication;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        return Catalog.listOfItem.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
       final LinearLayout rl;
       final TextView tf;
        ImageView imageView;
        if(view == null){
            //throw the context of the class
            rl = new LinearLayout(mContext);
            rl.setOrientation(LinearLayout.VERTICAL);
            imageView = new ImageView(mContext);
            //set the properties of the imageview
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

            imageView.setPadding(2,2,2,2);
//TXT
            tf = new TextView(mContext);
            //Price
            tf.setText("Product Name");
            tf.setTextSize(20f);
            tf.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            tf.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
            tf.setGravity(Gravity.END);

            //------- SETTING IN one LAYOUT
            imageView.setImageResource(Catalog.listOfItem[position]);
            rl.addView(imageView);
            rl.addView(tf);
            rl.setGravity(Gravity.CENTER);


        }else{
            rl = (LinearLayout) view;

        }




        return rl;
    }


}
