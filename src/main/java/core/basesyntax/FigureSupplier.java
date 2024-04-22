package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_SUBTYPES = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int figureChoice = random.nextInt(FIGURE_SUBTYPES);
        switch (figureChoice) {
            case 0 :
                return Circle.getRandomCircle();
            case 1 :
                return Rectangle.getRandomRectangle();
            case 2 :
                return Square.getRandomSquare();
            case 3 :
                return RightTriangle.getRandomRightTriangle();
            case 4 :
                return IsoscelesTrapezoid.getRandomIsoscelesTrapezoid();
            default :
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE);
    }
}
