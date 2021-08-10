package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MaxRandomNumber = 6;
    private final Random random = new Random();

    public String getRandomColor() {
        String[] listOfColours = new String[]{"purple", "blue", "green", "yellow", "red", "orange"};
        return listOfColours[random.nextInt(MaxRandomNumber)];
    }
}
