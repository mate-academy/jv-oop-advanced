package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]
            {"BLACK","BLUE", "RED", "WHITE", "GREEN", "YELLOW", "PURPLE", "GREY", "SILVER"};
    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
