package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String color;
        int countColors = 10;
        switch (new Random().nextInt(countColors) + 1) {
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
                break;
            default:
                color = "unknown color";
        }
        return color;
    }
}
