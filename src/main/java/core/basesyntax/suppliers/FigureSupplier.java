package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.properties.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int MEASUREMENT = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MEASUREMENT) + 1);
                return circle;

            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setHeight(random.nextInt(MEASUREMENT) + 1);
                isoscelesTrapezoid.setBottomBase(random.nextInt(MEASUREMENT) + 1);
                isoscelesTrapezoid.setTopBase(random.nextInt(MEASUREMENT) + 1);
                return isoscelesTrapezoid;

            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(random.nextInt(MEASUREMENT) + 1);
                rectangle.setSecondSide(random.nextInt(MEASUREMENT) + 1);
                return rectangle;

            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MEASUREMENT) + 1);
                rightTriangle.setSecondLeg(random.nextInt(MEASUREMENT) + 1);
                return rightTriangle;

            default:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MEASUREMENT) + 1);
                return square;

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
