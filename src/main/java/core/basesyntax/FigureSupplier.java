package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int indexOfFigures = new Random().nextInt(FIGURES_NUMBER);

        ColorSupplier colorSupplier = new ColorSupplier();

        switch (indexOfFigures) {
            case 1: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                return square;
            }
            case 2: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                rectangle.setSecondSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                return rectangle;
            }
            case 3: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(new Random().nextInt(MAX_RANDOM_NUMBER));
                rightTriangle.setSecondLeg(new Random().nextInt(MAX_RANDOM_NUMBER));
                return rightTriangle;
            }
            case 4: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(new Random().nextInt(MAX_RANDOM_NUMBER));
                return circle;
            }
            default: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setLowerSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                isoscelesTrapezoid.setUpperSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                isoscelesTrapezoid.setHeight(new Random().nextInt(MAX_RANDOM_NUMBER));
                return isoscelesTrapezoid;
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.name());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
