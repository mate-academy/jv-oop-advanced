package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public String getRandomColor() {
        return switch (RANDOM.nextInt(10)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "orange";
            case 5 -> "black";
            case 6 -> "cyan";
            case 7 -> "pink";
            case 8 -> "gray";
            default -> "white";
        };
    }
}
