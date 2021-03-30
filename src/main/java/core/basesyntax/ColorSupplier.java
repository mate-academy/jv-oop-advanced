package core.basesyntax;

public class ColorSupplier {
    public static String getColour() {
        int random = (int) (Math.random() * (5 - 1)) + 1;
        switch (random) {
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
