package core.basesyntax.temp;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int FIGURE_AMOUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_AMOUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextDouble());
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setBasisA(random.nextDouble());
        isoscelesTrapezoid.setBasisB(random.nextDouble());
        isoscelesTrapezoid.setHeight(random.nextDouble());
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstSide(random.nextDouble());
        rectangle.setSecondSide(random.nextDouble());
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextDouble());
        rightTriangle.setSecondLeg(random.nextDouble());
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextDouble());
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
