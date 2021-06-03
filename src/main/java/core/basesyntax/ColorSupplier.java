package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] colors = Colors.values();

    public String getRandomColor() {
        Random randomNumber = new Random();
        return colors[randomNumber.nextInt(4)].name();
    }
}
