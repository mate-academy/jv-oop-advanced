package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int MAX_NUMBER_OF_COLOR = 8;
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(MAX_NUMBER_OF_COLOR);
        String figureColor;
        switch (colorNumber) {
            case 0:
                figureColor = "yellow";
                break;
            case 1:
                figureColor = "red";
                break;
            case 2:
                figureColor = "green";
                break;
            case 3:
                figureColor = "blue";
                break;
            case 4:
                figureColor = "cyan";
                break;
            case 5:
                figureColor = "gray";
                break;
            case 6:
                figureColor = "magenta";
                break;
            case 7:
            default:
                figureColor = "black";
                break;
        }
        return figureColor;
    }
}
