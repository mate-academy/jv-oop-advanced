package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        final int colorNumber = 7;
        final int quasy = 41;
        String [] colorArray = {"Red", "Orange", "Green", "Yellow", "Blue", "Violet", "Black"};
        Random random = new Random();
        return colorArray[random.nextInt(quasy) % colorNumber];
    }
}
