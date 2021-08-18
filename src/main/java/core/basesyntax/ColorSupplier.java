package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String [] colorOfFigure = {"Pink", "Green", "Purple","Red", "White","Black"};

    public String getRandomColor() {
        Random randomColor = new Random();
        return colorOfFigure[randomColor.nextInt(colorOfFigure.length)];
    }
}
