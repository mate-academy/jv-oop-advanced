package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    private String [] colorSuppliers = {"RED", "BLUE", "GREEN", "YELLOW",
            "GRAY", "WHITE", "BLACK", "PURPLE"};

    public String getRandomColor() {
        int index = random.nextInt(colorSuppliers.length);
        return colorSuppliers[index];
    }
}
