package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUMBER = 6;
    private Random random = new Random();

    public String getRandomColor() {
        switch (random.nextInt(MAX_NUMBER)) {
            case 0:
                return "blue";
            case 1:
                return "red";
            case 2:
                return "black";
            case 3:
                return "white";
            case 4:
                return "green";
            default:
                return "grey";
        }
    }
}
