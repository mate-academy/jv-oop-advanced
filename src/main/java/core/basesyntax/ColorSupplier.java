package core.basesyntax;

import java.util.Random;

class ColorSupplier {

    private Random random = new Random();

    public Colors getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[random.nextInt(colors.length)];
    }
}

