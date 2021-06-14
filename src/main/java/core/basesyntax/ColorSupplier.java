package core.basesyntax;

public class ColorSupplier {
    public static final int COLOR_COUNT = 7;

    public static String getRandomColor() {
        int random = 1 + (int)(Math.random() * COLOR_COUNT);
        switch (random) {
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Light blue";
            case 6:
                return "Blue";
            case 7:
                return "Violet";
            default:
                System.out.println("Something wrong with color number randomizer, you'll get default color");
                return "Transparent";
        }
    }
}
