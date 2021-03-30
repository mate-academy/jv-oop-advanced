package core.basesyntax;

public class ColorSupplier {
    private static final int RANDOM_COLOUR_LIMIT = 5;

    public static String getColour() {
        switch ((int) ((Math.random() * RANDOM_COLOUR_LIMIT) + 1)) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "dark";
            case 4:
                return "grey";
            case 5:
                return "orange";
            default:
                return "olive";
        }
    }
}
