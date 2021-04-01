package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int RANDOM_LIMIT = 6;

    public String randomColor() {
        String color = "";
        Random random = new Random();

        switch (random.nextInt(RANDOM_LIMIT)) {
            case 1:
                color = "green";
                break;
            case 2:
                color = "blue";
                break;
            case 3:
                color = "white";
                break;
            case 4:
                color = "black";
                break;
            case 5:
            default:
                color = "red";
                break;
        }
        return color;
    }
}
