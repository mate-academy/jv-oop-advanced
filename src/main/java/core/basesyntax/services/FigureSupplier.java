package core.basesyntax.services;

import core.basesyntax.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_AMOUNT_OF_FIGURES = 5;
    private static final int MAX_NUMBER = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setRadius(DEFAULT_RADIUS);
        defaultFigure.setColor(DEFAULT_COLOR);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(random.nextInt(MAX_AMOUNT_OF_FIGURES) + 1);
        switch (figure) {
            case 0:
                return buildCircle();
            case 1:
                return buildIsoscelesTrapezoid();
            case 2:
                return buildRectangle();
            case 3:
                return buildRightTriangle();
            default:
                return buildSquare();
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_NUMBER) + 1;
    }

    private Circle buildCircle() {
        Circle circle = new Circle();
        circle.setRadius(getRandomNumber());
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private IsoscelesTrapezoid buildIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(getRandomNumber());
        isoscelesTrapezoid.setLowerBase(getRandomNumber());
        isoscelesTrapezoid.setUpperBase(getRandomNumber());
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Rectangle buildRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(getRandomNumber());
        rectangle.setWidth(getRandomNumber());
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle buildRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(getRandomNumber());
        rightTriangle.setSecondLeg(getRandomNumber());
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Square buildSquare() {
        Square square = new Square();
        square.setSide(getRandomNumber());
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
