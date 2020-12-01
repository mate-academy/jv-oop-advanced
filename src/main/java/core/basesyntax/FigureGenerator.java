package core.basesyntax;

import java.util.Random;

public class Optional {

    private static final String[] colors = new String[]{"black", "white", "whatever"};

    public static String getRandomColor() {
        return colors[new Random().nextInt(3)];
    }

    public static int getRandomArea() {
        return new Random().nextInt(200);
    }

}
