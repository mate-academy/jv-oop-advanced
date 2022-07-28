package auxiliary;

import java.util.Random;

public class ColorSupplier {
    private String color;

    public String getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
