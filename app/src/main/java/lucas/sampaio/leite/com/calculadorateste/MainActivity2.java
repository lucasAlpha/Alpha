package lucas.sampaio.leite.com.calculadorateste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Double result;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textViewRES);

        Intent it = getIntent();

        result = it.getDoubleExtra("RESULT", -1);
        textView.setText(String.valueOf(result));
    }
}

