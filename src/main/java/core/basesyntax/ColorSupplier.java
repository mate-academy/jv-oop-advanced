package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private  final String[] colors = new String[]{"white", "black", "blue", "red", "green"};
    Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length - 1)];
    }
}
