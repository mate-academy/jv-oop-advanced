package core.basesyntax.tools;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {

    public static final int MAX_COUNT_FIGURE = 6;
    public static final int MIN_COUNT_FIGURE = 3;
    public static final int COUNT_FIGURE = 5;

    public Figure getRandomFigure() {
        int randomFigureCase = new Random().nextInt(COUNT_FIGURE);
        switch (randomFigureCase) {
            case 0:
                return new Circle("circle");
            case 1:
                return new Square("square");
            case 2:
                return new Rectangle("rectangle");
            case 3:
                return new RightTriangle("rightTriangle");
            case 4:
                return new IsoscelesTrapezoid("isoscelesTrapezoid");
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("circle",10, Color.WHITE);
    }
}
