package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int indexOfFigures = new Random().nextInt(ListFigures.values().length);

        ColorSupplier colorSupplier = new ColorSupplier();

        switch (ListFigures.values()[indexOfFigures]) {
            case SQUARE: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                return square;
            }
            case RECTANGLE: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                rectangle.setSecondSide(new Random().nextInt(MAX_RANDOM_NUMBER));
                return rectangle;
            }
            case RIGHTTRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(new Random().nextInt(MAX_RANDOM_NUMBER));
                rightTriangle.setSecondLeg(new Random().nextInt(MAX_RANDOM_NUMBER));
                return rightTriangle;
            }
            case CIRCLE: {
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
        circle.setColor(Color.WHITE.name().toLowerCase());
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
