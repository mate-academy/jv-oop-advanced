package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int RADIUS_DEFAULT = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        int indexOfFigures = random.nextInt(GeometricFigure.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (GeometricFigure.values()[indexOfFigures]) {
            case SQUARE: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MAX_VALUE));
                return square;
            }
            case RECTANGLE: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(random.nextInt(MAX_VALUE));
                rectangle.setSecondSide(random.nextInt(MAX_VALUE));
                return rectangle;
            }
            case RIGHTTRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MAX_VALUE));
                rightTriangle.setSecondLeg(random.nextInt(MAX_VALUE));
                return rightTriangle;
            }
            case CIRCLE: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MAX_VALUE));
                return circle;
            }
            case ISOSCELESTRAPEZOID:
            default: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setFirstBase(random.nextInt(MAX_VALUE));
                isoscelesTrapezoid.setSecondBase(random.nextInt(MAX_VALUE));
                isoscelesTrapezoid.setHigh(random.nextInt(MAX_VALUE));
                return isoscelesTrapezoid;
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.name().toLowerCase());
        circle.setRadius(RADIUS_DEFAULT);
        return circle;
    }

}
