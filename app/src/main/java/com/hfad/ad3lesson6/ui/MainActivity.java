package com.hfad.ad3lesson6.ui;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.hfad.ad3lesson6.databinding.ActivityMainBinding;
import com.hfad.ad3lesson6.domain.Math;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding ui;
    private Math math;
    private Integer oper1;
    private Integer oper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        math = new Math();

        ui.btnAdd.setOnClickListener(v -> {getValues();
            ui.tvResult.setText(String.valueOf(math.add(oper1, oper2)));});

        ui.btnSubtract.setOnClickListener(v -> {getValues();
            ui.tvResult.setText(String.valueOf(math.sub(oper1, oper2)));});

        ui.btnDiv.setOnClickListener(v -> {getValues();
            ui.tvResult.setText(String.valueOf(math.div(oper1, oper2)));});

        ui.btnMul.setOnClickListener(v -> {getValues();
            ui.tvResult.setText(String.valueOf(math.mul(oper1, oper2)));});

        ui.btnPow.setOnClickListener(v -> {getValues();
            ui.tvResult.setText(String.valueOf(math.pow(oper1, oper2)));});

        ui.btnRoot.setOnClickListener(v -> {
            oper1 = Integer.parseInt(ui.etOperatorOne.getText().toString());
            ui.tvResult.setText(String.valueOf(math.sqRoot(oper1)));});

        ui.btnReverse.setOnClickListener(v -> {
            String words = ui.etOperatorOne.getText().toString();
            ui.tvResult.setText(String.valueOf(math.reverseWords(words)));});
    }

    private void getValues() {
        oper1 = Integer.parseInt(ui.etOperatorOne.getText().toString());
        oper2 = Integer.parseInt(ui.etOperatorTwo.getText().toString());
    }
}