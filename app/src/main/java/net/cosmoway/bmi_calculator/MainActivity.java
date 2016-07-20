package net.cosmoway.bmi_calculator;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mHeightEditText;
    private EditText mWeightEditText;
    private Button mCalculateBmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setListeners();
    }

    @Override
    public void onClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Message")
                .setPositiveButton(android.R.string.ok, null)
                .show();
    }

    private void findViews() {
        mHeightEditText = (EditText) findViewById(R.id.edittext_height);
        mWeightEditText = (EditText) findViewById(R.id.edittext_weight);
        mCalculateBmiButton = (Button) findViewById(R.id.button_calculate_bmi);
    }

    private void setListeners() {
        mCalculateBmiButton.setOnClickListener(this);
    }

    private static Double calcBMI(int heightCm, int weightKg) {
        double heightM = heightCm / 100;

        // BMI＝ 体重kg ÷ (身長m)^2
        double bmi = weightKg / Math.pow(heightM, 2);

        return bmi;
    }
}
