package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public String getRandomColor() {
        int indexRandom = RANDOM.nextInt(Color.values().length);
        String randomColor = Color.values()[indexRandom].name();

        return switch (randomColor) {
            case "RED" -> "red";
            case "GREEN" -> "green";
            case "BLUE" -> "blue";
            case "WHITE" -> "white";
            case "BLACK" -> "black";
            default -> throw new IllegalStateException("Unexpected value: " + randomColor);
        };
    }
}
