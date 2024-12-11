package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        StringBuilder sb = new StringBuilder("rgb(");
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        sb.append(red)
                .append(", ")
                .append(green)
                .append(", ")
                .append(blue)
                .append(")");
        return sb.toString();
    }
}
