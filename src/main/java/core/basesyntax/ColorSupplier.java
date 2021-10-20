package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_COUNT = 7;

    public String getRandomColor() {
        int colorNumber = new Random().nextInt(COLORS_COUNT);
        return Colors.values()[colorNumber].toString();
        /*switch (colorNumber) {
            case 0:
                return "white";
            case 1:
                return "black";
            case 2:
                return "yellow";
            case 3:
                return "pink";
            case 4:
                return "purple";
            case 5:
                return "grey";
            case 6:
                return "orange";
            default:
                break;
        }
        return "";*/
    }
}
