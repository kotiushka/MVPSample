package com.example.mvpexample.presenters;

import com.example.mvpexample.contracts.MainContract;
import com.example.mvpexample.models.CalculatorModel;

/**
 * @author kotiushka
 * @since 04.07.2023.
 */
public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final CalculatorModel model;

    public MainPresenter(MainContract.View view) {
        this.view = view;
        this.model = new CalculatorModel();
    }

    @Override
    public void incrementButton() {
        int result = model.addNumbers(view.getFirstNumber(), view.getSecondNumber());
        view.showResult(String.valueOf(result));
    }

    @Override
    public void decrementButton() {
        int result = model.subtractNumbers(view.getFirstNumber(), view.getSecondNumber());
        view.showResult(String.valueOf(result));
    }

}
