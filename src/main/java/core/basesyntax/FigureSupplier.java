package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public String getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int NUMBER_OF_FIGURE = 0;
        String value;
        switch (NUMBER_OF_FIGURE) {
            case 1:
                value = "Circle";
                break;
            case 2:
                value = "Rectangle";
                break;
            case 3:
                value = "RightTriangle";
                break;
            case 4:
                value = "IsoscelesTrapezoid";
                break;
            case 5:
                value = "Square";
                break;
                default:
                value = "Circle";
        }
        Random rand = new Random();
        rand.nextInt(NUMBER_OF_FIGURE);
        return value;
    }

    public String getDefaultFigure(){
        return "Figure: circle, radius: 10, color: WHITE";
    }
}
