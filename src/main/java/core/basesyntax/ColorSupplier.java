package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        switch (Colors.values()[new Random().nextInt(Colors.values().length)]) {
            case RED:
                return "red";
            case GREEN:
                return "green";
            case BLUE:
                return "blue";
            case WHITE:
                return "white";
            case BLACK:
                return "black";
            case GREY:
                return "grey";
            case ORANGE:
                return "orange";
            case BROWN:
                return "brown";
            default:
                return null;
        }
    }
}
