package com.example.repo4_orderarray;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public static void main(String[] args) {

        int[] NumbersArray = {100, 10, 2, 0, -1, 4, 3, 1000};

        int lengthArray = NumbersArray.length;

        // Loop to sort array using bubble method
        for (int i = 0; i < lengthArray - 1; i++) {
            for (int j = 0; j < lengthArray - 1; j++) {
                if (NumbersArray[j] > NumbersArray[j + 1]) {
                    int temp = NumbersArray[j];
                    NumbersArray[j] = NumbersArray[j + 1];
                    NumbersArray[j + 1] = temp;
                }
            }
        }

        // print ordered array
        System.out.println("Ordered array: ");
        for (int i = 0 ; i<lengthArray ; i++) {
            System.out.print(NumbersArray[i] + " ");
        }
    }
}