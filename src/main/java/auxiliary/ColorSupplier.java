package auxiliary;

import java.util.Random;

public class ColorSupplier {
    private String color;

    public void setRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public String getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
