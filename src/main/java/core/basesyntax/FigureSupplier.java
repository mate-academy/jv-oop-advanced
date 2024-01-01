package core.basesyntax;

import core.basesyntax.figures.AbstractFigure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE_VALUE = 101;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int index = random.nextInt(Figure.values().length);
        String nameOfFigure = Figure.values()[index].name();

        switch (nameOfFigure) {
            case "CIRCLE" : return getRandomCircle();
            case "ISOSCELES_TRAPEZOID" : return getRandomIsoscelesTrapezoid();
            case "RECTANGLE" : return getRandomRectangle();
            case "RIGHT_TRIANGLE" : return getRandomRightTriangle();
            default : return getRandomSquare();
        }
    }

    private AbstractFigure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(), getRandomSize());
        return isoscelesTrapezoid;
    }

    private AbstractFigure getRandomRectangle() {
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize());
        return rectangle;
    }

    private AbstractFigure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize());
        return rightTriangle;
    }

    private AbstractFigure getRandomSquare() {
        Square square = new Square(colorSupplier.getRandomColor(), getRandomSize());
        return square;
    }

    private AbstractFigure getRandomCircle() {
        Square circle = new Square(colorSupplier.getRandomColor(), getRandomSize());
        return circle;
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE_VALUE);
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }
}
