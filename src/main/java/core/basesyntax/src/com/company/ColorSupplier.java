package com.company;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
//  generating random color
        final Random random = new Random();
        // massive of 5 colors
        String[] colors = {"blue", "green", "magenta", "red", "yellow"
        };
        int pos = random.nextInt(colors.length);
        return colors[pos];
    }
}
