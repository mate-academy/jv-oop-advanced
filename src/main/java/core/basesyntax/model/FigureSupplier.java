package core.basesyntax.model;

import core.basesyntax.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_UNITS = 20;
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_SIZE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_NUMBER);
        switch (figureType) {
            case 0: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setFigureRadius(random.nextDouble(MAX_RANDOM_UNITS));
                return circle;
            }
            case 1: {
                Square square = new Square();
                square.setFigureSideSize(random.nextDouble(MAX_RANDOM_UNITS));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            }
            case 2: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFigureFirstLeg(random.nextInt(MAX_RANDOM_UNITS));
                rightTriangle.setFigureSecondLeg(random.nextInt(MAX_RANDOM_UNITS));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            }
            case 3: {
                Rectangle rectangle = new Rectangle();
                rectangle.setFigureHeight(random.nextInt(MAX_RANDOM_UNITS));
                rectangle.setFigureWidth(random.nextInt(MAX_RANDOM_UNITS));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            }
            default: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setFigureBottomSide(random.nextInt(MAX_RANDOM_UNITS));
                isoscelesTrapezoid.setFigureTopSide(random.nextInt(MAX_RANDOM_UNITS));
                isoscelesTrapezoid.setFigureHeight(random.nextInt(MAX_RANDOM_UNITS));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            }
        }
    }

    public Figure getDeafultFigure() {
        Circle circle = new Circle();
        circle.setColor("WHITE");
        circle.setFigureRadius(DEFAULT_SIZE);
        return circle;
    }
}
