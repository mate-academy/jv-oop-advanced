package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rnd = new Random();
        switch (rnd.nextInt(100) % 7) {
            case 0:
                return "red";
            case 1:
                return "orange";
            case 2:
                return "yellow";
            case 3:
                return "green";
            case 4:
                return "blue";
            case 5:
                return "violet";
            default:
                return "black";
        }
    }
}
