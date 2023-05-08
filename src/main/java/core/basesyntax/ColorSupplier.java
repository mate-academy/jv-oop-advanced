package core.basesyntax;

public class ColorSupplier {
    private static final int COLORS_COUNT = 6;

    public String getRandomColor() {
        int num = (int) (Math.random() * COLORS_COUNT);
        switch (num) {
            case 0:
                return "Black";
            case 1:
                return "White";
            case 2:
                return "Red";
            case 3:
                return "Orange";
            case 4:
                return "Green";
            default:
                return "Blue";
        }
    }
}
