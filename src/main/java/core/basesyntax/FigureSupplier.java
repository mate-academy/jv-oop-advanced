package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 6;
    private static final int RADIUS_DEFAULT = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexFigure = random.nextInt(GeometricFigure.values().length);

        switch (GeometricFigure.values()[indexFigure]) {
            case SQUARE: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MAX_NUMBER));
                return square;
            }
            case RECTANGLE: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(random.nextInt(MAX_NUMBER));
                rectangle.setSecondSide(random.nextInt(MAX_NUMBER));
                return rectangle;
            }
            case RIGTHTRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MAX_NUMBER));
                rightTriangle.setSecondLeg(random.nextInt(MAX_NUMBER));
                return rightTriangle;
            }
            case CIRCLE: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MAX_NUMBER));
                return circle;
            }
            case TRAPEZOID:
            default: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setFirstSide(random.nextInt(MAX_NUMBER));
                isoscelesTrapezoid.setSecondSide(random.nextInt(MAX_NUMBER));
                isoscelesTrapezoid.setHeight(random.nextInt(MAX_NUMBER));
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
