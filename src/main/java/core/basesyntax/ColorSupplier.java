package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String RED_COLOR = "red";
    private static final String BLUE_COLOR = "blue";
    private static final String GREEN_COLOR = "green";
    private static final String WHITE_COLOR = "white";
    private static final String YELLOW_COLOR = "yellow";
    private static final String ORANGE_COLOR = "orange";
    private static final String PURPLE_COLOR = "purple";
    private static final int COLOR_LIMIT = 7;

    public String generateColor() {
        Random random = new Random();

        switch (1 + random.nextInt(COLOR_LIMIT)) {
            case 1 :
                return RED_COLOR;
            case 2 :
                return BLUE_COLOR;
            case 3 :
                return GREEN_COLOR;
            case 4 :
                return WHITE_COLOR;
            case 5 :
                return YELLOW_COLOR;
            case 6 :
                return ORANGE_COLOR;
            default:
                return PURPLE_COLOR;
        }
    }
}
