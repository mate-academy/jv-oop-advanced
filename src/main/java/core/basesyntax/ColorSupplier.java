package core.basesyntax;

import java.util.Random;

public interface ColorSupplier {
    static String getColor() {
        Random generator = new Random();
        String[] colorArr = new String[2];
        colorArr[0] = "White";
        colorArr[1] = "Black";
        int randomIndex = generator.nextInt(colorArr.length);
        return colorArr[randomIndex];
    }
}
