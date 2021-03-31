package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String RandomColor() {
        String color = "";
        Random random = new Random();
        int ran = random.nextInt(5);
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