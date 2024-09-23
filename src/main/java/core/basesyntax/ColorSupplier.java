package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        String[] colors = {"white", "black", "orange", "yellow", "grey", "blue"};
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}
