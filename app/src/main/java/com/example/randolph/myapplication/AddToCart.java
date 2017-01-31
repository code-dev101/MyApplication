package com.example.randolph.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddToCart extends AppCompatActivity {

    private Button btnDec, btnInc, btnAddtoCart;
    private TextView txtQty, txtTPrice;
    private int qty, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);
        btnAddtoCart = (Button)findViewById(R.id.btnAddtoCart);
        btnDec = (Button)findViewById(R.id.btn_dec);
        btnInc = (Button)findViewById(R.id.btn_inc);
        txtQty = (TextView)findViewById(R.id.tvQty);
        txtTPrice = (TextView)findViewById(R.id.tvTotalPrice);

        qty = 0;
        price = 0;
    }

    public void onClickQty(View view){
        switch (view.getId()){
            case R.id.btn_inc:
                qty++;
                txtQty.setText(qty);
                break;
            case R.id.btn_dec:
                qty--;
                if(qty == 0) {
                    qty = 0;
                    txtQty.setText(qty);
                }
                break;
        }
    }
}
