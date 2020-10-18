package abdo.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyCalculator extends AppCompatActivity {

    TextView resault_tv;
    Button resault_btn, sub_btn, add_btn, multi_btn, devision_btn, per_btn;

    int firstNumber, secondNumber;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calculator);
        inflatButton();
    }

    public void inflatButton(){
        resault_tv = findViewById(R.id.result_tv_my);
        resault_btn = findViewById(R.id.result_btn_my);
        sub_btn = findViewById(R.id.sub_btn_my);
        add_btn = findViewById(R.id.add_btn_my);
        multi_btn = findViewById(R.id.multi_btn_my);
        devision_btn = findViewById(R.id.devi_btn_my);
        per_btn = findViewById(R.id.per_btn_my);
    }

    public void addNumberMy(View view) {
        Button b = (Button) view;
        resault_tv.append(b.getText().toString());
    }

    public void operation_my(View view) {
        Button b = (Button) view;

        switch (b.getText().toString()){
            case "+":
                firstNumber = Integer.valueOf(resault_tv.getText().toString());
                resault_tv.setText("");
                op = '+';
                break;

            case "-":
                firstNumber = Integer.valueOf(resault_tv.getText().toString());
                resault_tv.setText("");
                op = '-';
                break;

            case "*":
                firstNumber = Integer.valueOf(resault_tv.getText().toString());
                resault_tv.setText("");
                op = '*';
                break;

            case "/":
                firstNumber = Integer.valueOf(resault_tv.getText().toString());
                resault_tv.setText("");
                op = '/';
                break;

            case "%":
                firstNumber = Integer.valueOf(resault_tv.getText().toString());
                resault_tv.setText("");
                op = '%';
                break;

            case "=":
                secondNumber = Integer.valueOf(resault_tv.getText().toString());
                equalOperation(firstNumber, secondNumber, op);
                break;
        }
    }

    public void equalOperation(int f, int s, char op){
        switch (op){
            case '+':
                resault_tv.setText(f + s +"");
                break;

            case '-':
                resault_tv.setText(f - s +"");
                break;

            case '*':
                resault_tv.setText(f * s + "");
                break;

            case '/':
                resault_tv.setText(f / s + "");
                break;

            case '%':
                resault_tv.setText(f % s + "");
                break;
        }
    }

    public void delete_my(View view) {
        resault_tv.setText("");
        firstNumber = 0;
        secondNumber = 0;
    }
}