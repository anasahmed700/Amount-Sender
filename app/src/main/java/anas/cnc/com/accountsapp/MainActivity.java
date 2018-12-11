package anas.cnc.com.accountsapp;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero, one, two, three, four, five, six, seven, eight, nine, point, clear, send;
    private TextView input, update, sent;

    private int val1 = 0, val2;
    private int total = 20000, send_amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1){
            //call some material design APIs here
        }else {
            //Implement this feature without material design
        }
        Toolbar myToolbar = findViewById(R.id.toolbar);
        myToolbar.setTitle("Amount Sender");
        myToolbar.setSubtitle("by CNC");
        myToolbar.setNavigationIcon(R.drawable.ic_navigation);


        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "0");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "1");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "2");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "3");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "4");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "5");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "6");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "7");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "8");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input_num = Integer.parseInt(input.getText().toString()+ "9");
                if (input.getText().length() == 0) {
                    input.setText(String.valueOf(input_num));
                    compute_sub();
                } else {
                    if (val2 >= input_num) {
                        compute_add();
                        input.setText(String.valueOf(input_num));
                        compute_sub();
                    }
                }

            }
        });
//        point.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                input.setText(input.getText().toString() + ".");
//            }
//        });
        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (input.getText().length() > 1) {
                    if (val2 >= val1) {
                        compute_add();

                    CharSequence value = input.getText().toString();
                    input.setText(value.subSequence(0, value.length() - 1));

                        compute_sub();
                    }else {
                        input.setText("");
                    }
                } else {
                    val1 = 0;
                    input.setText("");
                    update.setText(String.valueOf(total));
                }
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send_amount = Integer.parseInt(input.getText().toString());
                sent.setText(String.valueOf(send_amount));
                setTotal(total - send_amount);
                update.setText(String.valueOf(getTotal()));
                input.setText("");
            }
        });
    }

    private void setupUIViews() {
        zero = findViewById(R.id.btn0);
        one = findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
//        point = findViewById(R.id.btndot);
        clear = findViewById(R.id.btnclr);
        send = findViewById(R.id.btn_send);
        input = findViewById(R.id.tv_input);
        update = findViewById(R.id.tv_update);
        send = findViewById(R.id.btn_send);
        sent = findViewById(R.id.sent);
    }

    private void compute_sub() {

        val1 = Integer.parseInt(input.getText().toString());
        val2 = Integer.parseInt(update.getText().toString());
        if (val2 >= val1) {
            val2 = val2 - val1;
            update.setText(String.valueOf(val2));
//            setTotal(Integer.parseInt(update.getText().toString()));
        } else {
            val1 = Integer.parseInt(input.getText().toString());
        }
    }

    private void compute_add() {
//        if(!Double.isNaN(val1)){
        val1 = Integer.parseInt(input.getText().toString());
        val2 = Integer.parseInt(update.getText().toString());
        if (val1 <= val2) {
            val2 = val2 + val1;
            update.setText(String.valueOf(val2));
//            setTotal(Integer.parseInt(update.getText().toString()));
        } else {
            val1 = Integer.parseInt(input.getText().toString());
        }
    }
    public void showSummary(View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }
}
