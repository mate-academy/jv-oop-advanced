package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public String getRandomColor() {

        ColorEnum[] values = ColorEnum.values();
        ColorEnum randomColor = values[random.nextInt(values.length)];

        return randomColor.name();
    }
}
