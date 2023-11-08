package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String [] COLOR = {"white", "black", "red", "blue", "yellow", "green"};
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
