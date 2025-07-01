package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final int MAX_INDEX = 8;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(MAX_INDEX);
        String color = "";
        switch (index) {
            case 0:
                color = "red";
                break;
            case 1:
                color = "yellow";
                break;
            case 2:
                color = "green";
                break;
            case 3:
                color = "brown";
                break;
            case 4:
                color = "black";
                break;
            case 5:
                color = "white";
                break;
            case 6:
                color = "blue";
                break;
            default:
                System.out.println("This is a default implementation.");
        }
        return color;
    }
}
