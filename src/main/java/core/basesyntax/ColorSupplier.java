package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        String color = null;
        switch (new Random().nextInt(10) + 1) {
            case 1:
                color = "white";
                break;
            case 2:
                color = "blue";
                break;
            case 3:
                color = "green";
                break;
            case 4:
                color = "brown";
                break;
            case 5:
                color = "red";
                break;
            case 6:
                color = "pink";
                break;
            case 7:
                color = "gray";
                break;
            case 8:
                color = "yellow";
                break;
            case 9:
                color = "purple";
                break;
            case 10:
                color = "black";
        }
        return color;
    }
}
