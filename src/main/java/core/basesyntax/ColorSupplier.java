package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private Color[] colors = Color.values();
    private Random random = new Random();

    public String getRandomColor() {

        int index = random.nextInt(colors.length);
        return colors[index].toString().toLowerCase();
    }
}
