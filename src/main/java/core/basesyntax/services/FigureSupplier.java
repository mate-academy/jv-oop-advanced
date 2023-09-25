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
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setRadius(10);
        defaultFigure.setColor(Color.WHITE.name().toLowerCase());
        return defaultFigure;
    }

    public Figure getRandomFigure(String figure) {
        switch (figure) {
            case "new Circle()":
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(figureCeilingParam) + 1);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case "new IsoscelesTrapezoid()":
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setHeight(random.nextInt(figureCeilingParam) + 1);
                isoscelesTrapezoid.setLowerBase(random.nextInt(figureCeilingParam) + 1);
                isoscelesTrapezoid.setUpperBase(random.nextInt(figureCeilingParam) + 1);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case "new Rectangle()":
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(random.nextInt(figureCeilingParam) + 1);
                rectangle.setWidth(random.nextInt(figureCeilingParam) + 1);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case "new RightTriangle()":
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(figureCeilingParam) + 1);
                rightTriangle.setSecondLeg(random.nextInt(figureCeilingParam) + 1);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case "new Square()":
                Square square = new Square();
                square.setSide(random.nextInt(figureCeilingParam) + 1);
                square.setColor(colorSupplier.getRandomColor());
                return square;
            default:
                return getDefaultFigure();
        }
    }
}
