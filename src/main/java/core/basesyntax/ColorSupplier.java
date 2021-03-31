package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final static int LIMIT = 5;
    public String RandomColor() {
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
        }
        return color;
    }
}