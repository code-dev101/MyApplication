package com.example.randolph.myapplication;

/**
 * Created by Randolph on 1/27/2017.
 */

public class Product {
    int id;
    String name;
    String price;
    String category_id;
    private Integer [] items_clothes = new Integer[]{
            R.drawable.anniv_tshirt,
            R.drawable.anniv_tshirt2,
            R.drawable.lim_edt,
            R.drawable.dryfit,
            R.drawable.hoody_jacket
    };
    private Integer [] item_bags = new Integer[]{
            R.drawable.backpack,
            R.drawable.ecobag,
            R.drawable.slingbag,
    };
    public Integer [] item_accs = new Integer[]{
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
    public Integer [] item_others = new Integer[]{
            R.drawable.sti_umbrella_folded,
            R.drawable.sti_umbrella_standard
    };


}
