package com.example.randolph.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MyCart extends AppCompatActivity {
    private Button btnCheckout;
    private TextView tvPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        btnCheckout = (Button)findViewById(R.id.btn_Checkout);


    }
}
