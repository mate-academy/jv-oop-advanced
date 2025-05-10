package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int FIGURE_COUNT = 10;
    private Random random = new Random();
    private String figureColor;
    private String[] colorVariations = new String[]
            {"Red", "Blue", "Green", "White", "Black", "Pink", "Gold", "Silver", "Trans", "Rain"};

    public String getRandomColor() {
        return colorVariations[random.nextInt(FIGURE_COUNT)];
    }
}
