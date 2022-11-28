package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT = 4;
    private static final int FIGURE_PARAMETERS = 5;
    private static final int DEFAULT_FIGURE_PARAMETERS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = getQuantityIndex();
        if (randomNumber == 0) {
            return getRandomSquare();
        } else if (getQuantityIndex() == 1) {
            RightTriangle rightTriangle = new RightTriangle(getFigureParameters(),
                    getFigureParameters());
            rightTriangle.drawFigure();
            return rightTriangle;
        } else if (getQuantityIndex() == 2) {
            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(getFigureParameters(),
                    getFigureParameters(), getFigureParameters());
            isoscelesTrapezoid.drawFigure();
            return isoscelesTrapezoid;
        } else if (getQuantityIndex() == 3) {
            Circle circle = new Circle(getFigureParameters());
            circle.drawFigure();
            return circle;
        } else {
            Rectangle rectangle = new Rectangle(getFigureParameters(), getFigureParameters());
            rectangle.drawFigure();
            return rectangle;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULR_COLOR, DEFAULT_RADIUS);
    }

    private int getQuantityIndex() {
        return random.nextInt(AMOUNT);
    }

    private int getFigureParameters() {
        return random.nextInt(FIGURE_PARAMETERS) + FIGURE_PARAMETERS;
    }
}
