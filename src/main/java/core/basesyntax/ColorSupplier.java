package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int LIMIT_COLOR_NUMBERS = 9;

    public String getRandomColor() {
        Random randomNumber = new Random();
        int colorNumber = randomNumber.nextInt(LIMIT_COLOR_NUMBERS) + 1;
        if (colorNumber == 1) {
            return "orange";
        } else if (colorNumber == 2) {
            return "red";
        } else if (colorNumber == 3) {
            return "yellow";
        } else if (colorNumber == 4) {
            return "gold";
        } else if (colorNumber == 5) {
            return "blue";
        } else if (colorNumber == 6) {
            return "brown";
        } else if (colorNumber == 7) {
            return "white";
        } else if (colorNumber == 8) {
            return "gray";
        } else {
            return "black";
        }
    }
}
