package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String[] colorsArr = {"green", "black", "white", "yellow", "orange"};
    private final Random random = new Random();

    public String getRandomColor() {
        int indx = random.nextInt(colorsArr.length);
        return colorsArr[indx];
    }
}
