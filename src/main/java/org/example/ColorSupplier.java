package org.example;

import java.util.Random;

public class ColorSupplier {

    private final String[] colors = {"red", "green", "blue", "yellow", "purple", "orange", "pink"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

}
