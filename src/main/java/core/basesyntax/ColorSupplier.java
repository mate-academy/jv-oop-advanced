package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"Blue", "Green", "Yellow", "Red", "Black", "Brown", "Violet"};

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}
