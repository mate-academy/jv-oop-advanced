package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        switch (new Random().nextInt(2)) {
            case 0:
                return "blue";
            case 1:
                return "red";
            case 2:
                return "green";
            default:
                return "white";
        }
    }
}