package lucas.sampaio.leite.com.calculadorateste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSUM, btnSUB, btnMUL, btnDIV;
    private EditText editTextNum1, editTextNum2;
    private TextView textViewResult;

    public static final String SEND_MESSAGE = "RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSUM = (Button) findViewById(R.id.buttonSUM);
        btnSUB = (Button) findViewById(R.id.buttonSUB);
        btnMUL = (Button) findViewById(R.id.buttonMUL);
        btnDIV = (Button) findViewById(R.id.buttonDIV);

        editTextNum1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNumber2);

        textViewResult = (TextView) findViewById(R.id.textViewResult);

        createListeners();
    }

    private void createListeners() {
        btnSUM.setOnClickListener(evt -> operation(0));
        btnSUB.setOnClickListener(evt -> operation(1));
        btnMUL.setOnClickListener(evt -> operation(2));
        btnDIV.setOnClickListener(evt -> operation(3));
    }

//    private void createListeners() {
//        btnSUM.setOnClickListener(evt -> add());
//        btnSUB.setOnClickListener(evt -> sub());
//        btnMUL.setOnClickListener(evt -> mult());
//        btnDIV.setOnClickListener(evt -> div());
//    }

    private void add() {
        Double num1 = Double.parseDouble(editTextNum1.getText().toString());
        Double num2 = Double.parseDouble(editTextNum2.getText().toString());
        textViewResult.setText(String.valueOf(num1+num2));
    }

    private void sub() {
        Double num1 = Double.parseDouble(editTextNum1.getText().toString());
        Double num2 = Double.parseDouble(editTextNum2.getText().toString());
        textViewResult.setText(String.valueOf(num1-num2));
    }

    private void mult() {
        Double num1 = Double.parseDouble(editTextNum1.getText().toString());
        Double num2 = Double.parseDouble(editTextNum2.getText().toString());
        textViewResult.setText(String.valueOf(num1*num2));
    }

    private void div() {
        Double num1 = Double.parseDouble(editTextNum1.getText().toString());
        Double num2 = Double.parseDouble(editTextNum2.getText().toString());
        textViewResult.setText(String.valueOf(num1/num2));
    }


    private void operation(int op){

        Double num1 = Double.parseDouble(editTextNum1.getText().toString());
        Double num2 = Double.parseDouble(editTextNum2.getText().toString());

        Intent it = new Intent(this, MainActivity2.class);

        switch(op) {
            case 0:
                it.putExtra(SEND_MESSAGE, num1+num2);
                startActivity(it);
                break;
            case 1:
                it.putExtra(SEND_MESSAGE, num1-num2);
                startActivity(it);
                break;
            case 2:
               it.putExtra(SEND_MESSAGE, num1*num2);
               startActivity(it);
               break;
            case 3:
                it.putExtra(SEND_MESSAGE, num1/num2);
                startActivity(it);
                break;
        }
    }
}