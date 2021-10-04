package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int FIGURE_COUNT = 6;

    private String [] randomColor = new String[] {"Red","Blue","White","Multicolor","Gray","Brown"};

    public String getRandomColor() {
        Random random = new Random();
        int figureNumber = random.nextInt(randomColor.length);
        return randomColor[figureNumber];
    }
}
