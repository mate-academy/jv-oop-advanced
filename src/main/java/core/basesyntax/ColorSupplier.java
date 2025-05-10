package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;

    public static String color() {
        Random random = new Random();
        int choose = random.nextInt(COLOR_COUNT);

        switch (choose) {
            case 1:
                return "white";
            case 2:
                return "blue";
            case 3:
                return "red";
            case 4:
                return "yellow";
            case 5:
                return "pink";
            default:
                return "black";
        }
    }
}
