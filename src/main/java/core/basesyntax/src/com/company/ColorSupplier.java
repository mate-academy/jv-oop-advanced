package com.company;

import java.util.Random;

public class ColorSupplier {

    final Random random = new Random();
    String[] colors = {"blue", "green", "magenta", "red", "yellow"};

    public String getRandomColor() {
        int pos = random.nextInt(colors.length);
        return colors[pos];
    }

}
