package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int colorNumber;

    public ColorSupplier(int colorNumber) {
        this.colorNumber = colorNumber;
    }

    public String getRandomColor() {
        String color;
        switch (colorNumber) {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Pink";
                break;
            default:
                color = "Yellow";
        }
        return color;
    }
}
