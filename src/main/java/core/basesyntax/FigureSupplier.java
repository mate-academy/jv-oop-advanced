package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE_VALUE = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        String nameOfFigure = FigureList.values()[index].name();

        switch (nameOfFigure) {
            case "CIRCLE" : return getRandomCircle();
            case "ISOSCELES_TRAPEZOID" : return getRandomIsoscelesTrapezoid();
            case "RECTANGLE" : return getRandomRectangle();
            case "RIGHT_TRIANGLE" : return getRandomRightTriangle();
            default : return getRandomSquare();
        }
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(), getRandomSize());
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize());
        return rectangle;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize());
        return rightTriangle;
    }

    public Figure getRandomSquare() {
        Square square = new Square(colorSupplier.getRandomColor(), getRandomSize());
        return square;
    }

    public Figure getRandomCircle() {
        Square circle = new Square(colorSupplier.getRandomColor(), getRandomSize());
        return circle;
    }

    public int getRandomSize() {
        return random.nextInt(MAX_SIZE_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
