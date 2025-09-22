package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final String[] COLORS = {
            "white", "blue", "yellow",
            "green", "red", "black",
            "orange", "violet"
    };
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int random = RANDOM.nextInt(COLORS.length);

        return COLORS[random];
    }
}
