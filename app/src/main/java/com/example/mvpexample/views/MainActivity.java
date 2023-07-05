package com.example.mvpexample.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvpexample.R;
import com.example.mvpexample.contracts.MainContract;
import com.example.mvpexample.presenters.MainPresenter;

/**
 * @author kotiushka
 * @since 04.07.2023.
 */
public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    private TextView operationsResult;

    private EditText editTextFirstNum;
    private EditText editTextSecondNum;

    private Button plusButton;
    private Button minusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setListeners();
    }

    private void init() {
        presenter = new MainPresenter(this);

        operationsResult = findViewById(R.id.result);

        editTextFirstNum = findViewById(R.id.firstNum);
        editTextSecondNum = findViewById(R.id.secondNum);

        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
    }

    private void setListeners() {
        plusButton.setOnClickListener((l) -> presenter.incrementButton());
        minusButton.setOnClickListener((l) -> presenter.decrementButton());
    }

    @Override
    public int getFirstNumber() {
        return Integer.parseInt(editTextFirstNum.getText().toString());
    }

    @Override
    public int getSecondNumber() {
        return Integer.parseInt(editTextSecondNum.getText().toString());
    }

    @Override
    public void showResult(String result) {
        operationsResult.setText(result);
    }

}