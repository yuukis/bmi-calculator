package net.cosmoway.bmi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mHeightEditText;
    private EditText mWeightEditText;
    private Button mCalculateBmiButtom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        mHeightEditText = (EditText) findViewById(R.id.edittext_height);
        mWeightEditText = (EditText) findViewById(R.id.edittext_weight);
        mCalculateBmiButtom = (Button) findViewById(R.id.button_calculate_bmi);
    }
}
