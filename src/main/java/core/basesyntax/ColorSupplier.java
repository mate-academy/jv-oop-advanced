package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS = 7;

    public static String getRandomColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(COLORS);

        switch (colorNumber) {
            case 1:
                return "black";
            case 2:
                return "green";
            case 3:
                return "blue";
            case 4:
                return "white";
            case 5:
                return "orange";
            case 6:
                return "yellow";
            case 7:
                return "brown";
            default:
                return "red";
        }
    }
}
