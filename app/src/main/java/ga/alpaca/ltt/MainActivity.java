package ga.alpaca.ltt;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView _screen;
    private String display;
    ArrayList arrayList = new ArrayList();
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_0 = (Button) findViewById(R.id.zero);
        Button btn_1 = (Button) findViewById(R.id.one);
        Button btn_2 = (Button) findViewById(R.id.two);
        Button btn_3 = (Button) findViewById(R.id.three);
        Button btn_4 = (Button) findViewById(R.id.four);
        Button btn_5 = (Button) findViewById(R.id.five);
        Button btn_6 = (Button) findViewById(R.id.six);
        Button btn_7 = (Button) findViewById(R.id.seven);
        Button btn_8 = (Button) findViewById(R.id.eight);
        Button btn_9 = (Button) findViewById(R.id.nine);

        Button btn_c = (Button) findViewById(R.id.clear);
        Button btn_add = (Button) findViewById(R.id.add);
        Button btn_subtract = (Button) findViewById(R.id.subtract);
        Button btn_multiply = (Button) findViewById(R.id.multiply);
        Button btn_divide = (Button) findViewById(R.id.divide);
        Button btn_equals = (Button) findViewById(R.id.equals);

        btn_c.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_subtract.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        String customFont = "fonts/RobotoMono-Regular.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.outPut);
        textView.setTypeface(typeface);

        String customFontS = "fonts/SpoqaHanSansThin.ttf";
        Typeface typefaceE = Typeface.createFromAsset(getAssets(), customFontS);
        TextView textView1 = (TextView) findViewById(R.id.one);
        TextView textView2 = (TextView) findViewById(R.id.two);
        TextView textView3 = (TextView) findViewById(R.id.three);
        TextView textView4 = (TextView) findViewById(R.id.four);
        TextView textView5 = (TextView) findViewById(R.id.five);
        TextView textView6 = (TextView) findViewById(R.id.six);
        TextView textView7 = (TextView) findViewById(R.id.seven);
        TextView textView8 = (TextView) findViewById(R.id.eight);
        TextView textView9 = (TextView) findViewById(R.id.nine);
        TextView textView0 = (TextView) findViewById(R.id.zero);
        TextView textViewM = (TextView) findViewById(R.id.multiply);
        TextView textViewS = (TextView) findViewById(R.id.subtract);
        TextView textViewD = (TextView) findViewById(R.id.divide);
        TextView textViewA = (TextView) findViewById(R.id.add);
        TextView textViewE = (TextView) findViewById(R.id.equals);
        TextView textViewC = (TextView) findViewById(R.id.clear);
        textView1.setTypeface(typefaceE);
        textView2.setTypeface(typefaceE);
        textView3.setTypeface(typefaceE);
        textView4.setTypeface(typefaceE);
        textView5.setTypeface(typefaceE);
        textView6.setTypeface(typefaceE);
        textView7.setTypeface(typefaceE);
        textView8.setTypeface(typefaceE);
        textView9.setTypeface(typefaceE);
        textView0.setTypeface(typefaceE);
        textViewM.setTypeface(typefaceE);
        textViewS.setTypeface(typefaceE);
        textViewD.setTypeface(typefaceE);
        textViewA.setTypeface(typefaceE);
        textViewE.setTypeface(typefaceE);
        textViewC.setTypeface(typefaceE);

    }

    public void onClick(View v) {
        TextView outPut = (TextView) findViewById(R.id.outPut);
        switch (v.getId()) {

            case R.id.clear:

                arrayList.clear();
                outPut.setText("");


                break;

            case R.id.zero:
                outPut.setText(outPut.getText().toString() + "0");
                break;
            case R.id.one:
                outPut.setText(outPut.getText().toString() + "1");
                break;
            case R.id.two:
                outPut.setText(outPut.getText().toString() + "2");
                break;
            case R.id.three:
                outPut.setText(outPut.getText().toString() + "3");
                break;
            case R.id.four:
                outPut.setText(outPut.getText().toString() + "4");
                break;
            case R.id.five:
                outPut.setText(outPut.getText().toString() + "5");
                break;
            case R.id.six:
                outPut.setText(outPut.getText().toString() + "6");
                break;
            case R.id.seven:
                outPut.setText(outPut.getText().toString() + "7");
                break;
            case R.id.eight:
                outPut.setText(outPut.getText().toString() + "8");
                break;
            case R.id.nine:
                outPut.setText(outPut.getText().toString() + "9");
                break;


            case R.id.add:
                arrayList.add(outPut.getText().toString());
                outPut.setText("");
                count = 1;
                break;

            case R.id.subtract:
                arrayList.add(outPut.getText().toString());
                outPut.setText("");
                count = 2;
                break;

            case R.id.multiply:
                arrayList.add(outPut.getText().toString());
                outPut.setText("");
                count = 3;
                break;

            case R.id.divide:
                arrayList.add(outPut.getText().toString());
                outPut.setText("");
                count = 4;
                break;


            case R.id.equals:

                int sum1 = 0, sum2 = 0, sum3, count2 = 0;

                double fsum1 = 0, fsum2 = 0, fsum3 = 0;


                if (arrayList.isEmpty()) {


                    outPut.setText("");
                } else {

                    Object obj = arrayList.get(0);
                    String num1 = (String) obj;
                    String num2 = outPut.getText().toString();

                    if (num1.contains(".") || num2.contains(".")) {

                        count2 = 1;
                        fsum1 = Float.parseFloat(num1);
                        fsum2 = Float.parseFloat(num2);

                    } else {
                        sum1 = Integer.parseInt(num1);
                        sum2 = Integer.parseInt(num2);
                        sum3 = 0;
                    }
                    String val = "";

                    switch (count) {
                        case 0:

                            outPut.setText("");


                        case 1:

                            if (count2 == 1) {

                                fsum3 = fsum1 + fsum2;

                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 + sum2;
                                val = String.valueOf(sum3);

                            }

                            outPut.setText(val);
                            arrayList.clear();
                            break;

                        case 2:

                            if (count2 == 1) {

                                fsum3 = fsum1 - fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 - sum2;
                                val = String.valueOf(sum3);

                            }
                            outPut.setText(val);
                            arrayList.clear();
                            break;

                        case 3:

                            if (count2 == 1) {

                                fsum3 = fsum1 * fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 * sum2;
                                val = String.valueOf(sum3);

                            }
                            outPut.setText(val);
                            arrayList.clear();
                            break;

                        case 4:

                            if (count2 == 1) {

                                fsum3 = fsum1 / fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 / sum2;
                                val = String.valueOf(sum3);

                            }
                            outPut.setText(val);
                            arrayList.clear();
                            break;
                    }


                }


                break;

        }


    }
}

