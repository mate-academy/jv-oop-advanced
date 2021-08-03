package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 5;
    private Random random = new Random();
    private String color;

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        switch (colorNumber) {
            case 0:
                color = "red";
                break;
            case 1:
                color = "green";
                break;
            case 2:
                color = "blue";
                break;
            case 4:
                color = "white";
                break;
            default:
                color = "black";
                break;
        }
        return color;
    }
}
