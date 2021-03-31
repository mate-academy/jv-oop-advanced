package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUM_COLORS = 5;
    private static Random random = new Random();

    public String getRandomColor() {
        int colors = random.nextInt(NUM_COLORS) + 1;
        String color = "";
        switch (colors) {
            case 1:
                color = "blue";
                break;
            case 2:
                color = "yellow";
                break;
            case 3:
                color = "red";
                break;
            case 4:
                color = "black";
                break;
            case 5:
                color = "green";
                break;
            default:
                break;
        }
        return color;
    }
}
