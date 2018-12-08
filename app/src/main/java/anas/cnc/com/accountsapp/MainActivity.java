package anas.cnc.com.accountsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero, one, two, three, four, five, six, seven, eight, nine, point, clear, send;
    private TextView input, update;

    private Double val1 = Double.NaN, val2;
    private final Double TOTAL = 20000.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                input.setText(input.getText().toString() + ".");
            }
        });
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
                    val1 = Double.NaN;
                    input.setText("");
                    update.setText(String.valueOf(TOTAL));
                }
            }
        });
    }

    private void setupUIViews() {
        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        point = (Button) findViewById(R.id.btndot);
        clear = (Button) findViewById(R.id.btnclr);
        send = (Button) findViewById(R.id.btn_send);
        input = (TextView) findViewById(R.id.tv_input);
        update = (TextView) findViewById(R.id.tv_update);
    }

    private void compute_sub() {

        val1 = Double.parseDouble(input.getText().toString());
        val2 = Double.parseDouble(update.getText().toString());
        if (val2 >= val1) {
            val2 = val2 - val1;
            update.setText(String.valueOf(val2));
        } else {
            val1 = Double.parseDouble(input.getText().toString());
        }
    }

    private void compute_add() {
//        if(!Double.isNaN(val1)){
        val1 = Double.parseDouble(input.getText().toString());
        val2 = Double.parseDouble(update.getText().toString());
        if (val1 <= val2) {
            val2 = val2 + val1;
            update.setText(String.valueOf(val2));
        } else {
            val1 = Double.parseDouble(input.getText().toString());
        }
    }


}
