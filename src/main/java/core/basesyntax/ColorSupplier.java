package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 10;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLOR_COUNT);
        switch (index) {
            case 1:
                return "yellow";
            case 2:
                return "green";
            case 3:
                return "brown";
            case 4:
                return "blue";
            case 5:
                return "black";
            case 6:
                return "red";
            case 7:
                return "purple";
            case 8:
                return "orange";
            case 9:
                return "magenta";
            default:
                return "white";
        }
    }
}
