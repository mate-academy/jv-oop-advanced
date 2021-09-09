package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random r = new Random();
        int n = r.nextInt(7) + 1;
        String color = "";
        switch (n) {
            case (1):
                color = "red";
                break;
            case (2):
                color = "orange";
                break;
            case (3):
                color = "yellow";
                break;
            case (4):
                color = "green";
                break;
            case (5):
                color = "light blue";
                break;
            case (6):
                color = "blue";
                break;
            case (7):
                color = "purple";
                break;
            default:
                color = "";
        }
        return color;
    }
}
