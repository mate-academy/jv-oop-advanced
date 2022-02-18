package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = new String[] {"black", "yellow", "white", "pink", "green", "pink"};

    public String getRandomColor() {
        Random randomColor = new Random();
        int index = randomColor.nextInt(colors.length);
        return colors[index];
    }
}
