package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int LIMIT = 6;

    public String randomColor() {

        String color = "";
        Random random = new Random();
        int ran = random.nextInt(LIMIT);
        switch (ran) {
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
                color = "red";
                break;
            default:
                break;
        }
        return color;
    }
}
