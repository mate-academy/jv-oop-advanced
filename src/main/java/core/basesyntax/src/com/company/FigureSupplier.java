package com.company;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    private Random random = new Random();

    public int getRandomFigure() {
        //generate a specific figure based on the `figureNumber` value
        return random.nextInt(FIGURE_COUNT);
    }
}

