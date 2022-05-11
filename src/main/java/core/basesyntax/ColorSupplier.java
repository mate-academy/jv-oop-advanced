package core.basesyntax;


import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        switch (Color.values()[index]) {
            case BLUE:
                return "Blue";
            case GREEN:
                return "Green";
            case WHITE:
                return "White";
            case YELLOW:
                return "Yellow";
            case RED:
                return "Red";
            default:
                return "Violet";
        }
    }
}
