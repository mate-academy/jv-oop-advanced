package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (FigureName.values()[figureNumber].toString()) {
            case ("CIRCLE"):
                return new Circle();
            case ("RECTANGLE"):
                return new Rectangle();
            case ("SQUARE"):
                return new Square();
            case ("RIGHT_TRIANGLE"):
                return new RightTriangle();
            default:
                return new IsoscelesTrapezoid();
        }
    }
}
