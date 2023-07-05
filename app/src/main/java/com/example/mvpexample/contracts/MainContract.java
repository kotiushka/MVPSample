package com.example.mvpexample.contracts;

/**
 * @author kotiushka
 * @since 04.07.2023.
 */
public interface MainContract {

    interface View {
        int getFirstNumber();
        int getSecondNumber();

        void showResult(String result);
    }

    interface Presenter {
        void incrementButton();
        void decrementButton();
    }

}
