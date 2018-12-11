package anas.cnc.com.accountsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView balance;
    MainActivity ma = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        setupUIViews();


    }

    private void setupUIViews(){
        String balanceString = "Rs." + ma.getVal2();
        balance = (TextView)findViewById(R.id.balance);
        balance.setText(balanceString);
    }

}
