package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        String[] randomColor = {"Blue", "White", "Green", "Red", "Yellow", "Black"};
        String color = randomColor[new Random().nextInt(randomColor.length)];
        return color;
    }
}


