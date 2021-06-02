package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] colors = Colors.values();

    public String getRandomColor() {
        Random randomNumber = new Random();
        switch (randomNumber.nextInt(4)) {
            case 0:
                return colors[0].name();
            case 1:
                return colors[1].name();
            case 2:
                return colors[2].name();
            default:
                return colors[3].name();
        }
    }
}
