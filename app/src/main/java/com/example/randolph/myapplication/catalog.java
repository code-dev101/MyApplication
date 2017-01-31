package com.example.randolph.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Catalog extends AppCompatActivity {
    private ImageView img_tshirt,img_bag,img_acc,img_others;
    public static Integer [] listOfItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        img_tshirt = (ImageView) findViewById(R.id.tshirts);
        img_bag = (ImageView) findViewById(R.id.bag);
        img_acc = (ImageView) findViewById(R.id.acc);
        img_others = (ImageView) findViewById(R.id.others);
        img_tshirt.setOnClickListener( new onClickList());
        img_bag.setOnClickListener( new onClickList());
        img_acc.setOnClickListener( new onClickList());
        img_others.setOnClickListener( new onClickList());

    }




    private class onClickList implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.tshirts:
                    Toast.makeText(getApplicationContext(),"Your clicking Tshirt",Toast.LENGTH_LONG).show();
                    listOfItem = new Integer[items_clothes.length];
                    listOfItem = items_clothes;
                    break;
                case R.id.bag:
                    listOfItem = new Integer[item_bags.length];
                    listOfItem = item_bags;
                    break;
                case R.id.acc:
                    listOfItem = new Integer[item_accs.length];
                    listOfItem = item_accs;
                    break;
                case R.id.others:
                    listOfItem = new Integer[item_others.length];
                    listOfItem = item_others;
                    break;
            }
            startActivity(new Intent(getApplicationContext(),Itemlist.class));
        }
    }
    public static Integer [] items_clothes = new Integer[]{
            R.drawable.anniv_tshirt,
            R.drawable.anniv_tshirt2,
            R.drawable.lim_edt,
            R.drawable.dryfit,
            R.drawable.hoody_jacket
    };
    public static Integer [] item_bags = new Integer[]{
            R.drawable.backpack,
            R.drawable.ecobag,
            R.drawable.slingbag,
    };
    public static Integer [] item_accs = new Integer[]{
            R.drawable.baller,
            R.drawable.button_pins,
            R.drawable.dog_tag,
            R.drawable.keychain,
            R.drawable.sti_cellphone_chain,
            R.drawable.pillow,
            R.drawable.pouch,
            R.drawable.set_of_pens,
            R.drawable.sti_cap_black,

    };
    public static Integer [] item_others = new Integer[]{
            R.drawable.sti_umbrella_folded,
            R.drawable.sti_umbrella_standard
    };


}
