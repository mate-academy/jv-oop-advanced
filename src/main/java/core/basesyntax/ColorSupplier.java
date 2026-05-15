package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final int COLORS_COUNT = Colors.values().length;

    private Random rand = new Random();

    public Colors getRandomColor() {

        int randomindex = rand.nextInt(COLORS_COUNT);

        return Colors.values()[randomindex];

    }

}
