package core.basesyntax;

import java.util.Random;

public class ColourSupplier {
    private static final int COLOUR_COUNT = 5;
    private Random random = new Random();

    public String getRandomColour() {
        /*switch (random.nextInt(COLOUR_COUNT)) {
            case 1:
                return Colours.RED.name().toLowerCase();
            case 2:
                return Colours.BLACK.name().toLowerCase();
            case 3:
                return Colours.GREEN.name().toLowerCase();
            case 4 :
                return Colours.BLUE.name().toLowerCase();
            default:
                return Colours.WHITE.name().toLowerCase();
        }*/
        return Colour.values()[random.nextInt(COLOUR_COUNT)].name();
    }
}
