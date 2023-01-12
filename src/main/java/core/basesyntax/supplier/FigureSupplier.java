package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        switch (number) {
            case 0: {
                return getRandomCircle();
            }
            case 1: {
                return getRandomRectangle();
            }
            case 2: {
                return getRandomSquare();
            }
            case 3: {
                return getRandomRightTriangle();
            }
            case 4: {
                return getRandomIsoscelesTrapezoid();
            }
            default: {
                return getRandomIsoscelesTrapezoid();
            }
        }
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(100));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(random.nextInt(100));
        rectangle.setSideB(random.nextInt(100));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(100));
        rightTriangle.setSecondLeg(random.nextInt(100));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(100));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setSideA(random.nextInt(100));
        isoscelesTrapezoid.setSideB(random.nextInt(100));
        isoscelesTrapezoid.setHeight(random.nextInt(100));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
