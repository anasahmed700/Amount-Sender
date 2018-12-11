package anas.cnc.com.accountsapp;

import android.app.Activity;
import android.app.ListActivity;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Activity2 extends ListActivity {

    private TextView balance;
    MainActivity ma = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ConstraintLayout cl = (ConstraintLayout)findViewById(R.id.summary_bg);
        AnimationDrawable ad = (AnimationDrawable)cl.getBackground();
        ad.setEnterFadeDuration(2000);
        ad.setExitFadeDuration(4000);
        ad.start();

        setupUIViews();

        String[] list_items = {"Ahmed", "Ali", "Muhammad", "Umar", "Zaid"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), )
    }

    private void setupUIViews(){
        String balanceString = "Rs." + ma.getTotal();
        balance = (TextView)findViewById(R.id.balance);
        balance.setText(balanceString);
    }

}
