package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 4;
    private static final int RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(FIGURE_NUMBER);
        switch (indexFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomSquare();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        int indexFigure = random.nextInt(FIGURE_NUMBER);
        switch (indexFigure) {
            case 0:
                return getDefaultCircle();
            case 1:
                return getDefaultRectangle();
            case 2:
                return getDefaultRightTriangle();
            case 3:
                return getDefaultSquare();
            default:
                return getDefaultIsoscelesTrapezoid();
        }
    }

    private int getRandomInt() {
        return random.nextInt(RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private Figure getDefaultCircle() {
        return new Circle("BLUE", 5);
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(), getRandomDouble());
    }

    private Figure getDefaultRectangle() {
        return new Rectangle("WHITE",5, 5);
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(), getRandomInt());
    }

    private Figure getDefaultRightTriangle() {
        return new RightTriangle("BLACK", 5, 5);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private Figure getDefaultSquare() {
        return new Square("YELLOW",6);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                getRandomDouble(), getRandomDouble());
    }

    private Figure getDefaultIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid("Black", 5.0, 5.0, 5.0);
    }
}
