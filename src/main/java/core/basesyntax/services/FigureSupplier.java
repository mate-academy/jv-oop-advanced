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
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER = 10;
    private static final int MAX_AMOUNT_OF_FIGURES = 6;
    private final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setRadius(DEFAULT_RADIUS);
        defaultFigure.setColor(Color.WHITE.name().toLowerCase());
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(random.nextInt(MAX_AMOUNT_OF_FIGURES) + 1);
        switch (figure) {
            case 1:
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(MAX_NUMBER) + 1);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 2:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setHeight(random.nextInt(MAX_NUMBER) + 1);
                isoscelesTrapezoid.setLowerBase(random.nextInt(MAX_NUMBER) + 1);
                isoscelesTrapezoid.setUpperBase(random.nextInt(MAX_NUMBER) + 1);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case 3:
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(random.nextInt(MAX_NUMBER) + 1);
                rectangle.setWidth(random.nextInt(MAX_NUMBER) + 1);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 4:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(MAX_NUMBER) + 1);
                rightTriangle.setSecondLeg(random.nextInt(MAX_NUMBER) + 1);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 5:
                Square square = new Square();
                square.setSide(random.nextInt(MAX_NUMBER) + 1);
                square.setColor(colorSupplier.getRandomColor());
                return square;
            default:
                return getDefaultFigure();
        }
    }
}
