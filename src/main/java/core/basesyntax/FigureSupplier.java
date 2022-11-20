package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT = 4;
    private static final int FIGURE_PARAMETERS = 5;
    private static final int DEFAULT_FIGURE_PARAMETERS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Figure getRandomFigure(Figure figure) {
        if (getQuantityIndex() == 0) {
            Square square = new Square(getFigureParameters());
            square.drawFigure();
        } else if (getQuantityIndex() == 1) {
            RightTriangle rightTriangle = new RightTriangle(getFigureParameters(),
                    getFigureParameters());
            rightTriangle.drawFigure();
        } else if (getQuantityIndex() == 2) {
            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(getFigureParameters(),
                    getFigureParameters(), getFigureParameters());
            isoscelesTrapezoid.drawFigure();
        } else if (getQuantityIndex() == 3) {
            Circle circle = new Circle(getFigureParameters());
            circle.drawFigure();
        } else {
            Rectangle rectangle = new Rectangle(getFigureParameters(), getFigureParameters());
            rectangle.drawFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure(Figure figure) {
        Circle circle = new Circle(DEFAULT_FIGURE_PARAMETERS);
        circle.drawDefaultCircle();
        return figure;
    }

    private int getQuantityIndex() {
        return random.nextInt(AMOUNT);
    }

    private int getFigureParameters() {
        return random.nextInt(FIGURE_PARAMETERS) + FIGURE_PARAMETERS;
    }
}
