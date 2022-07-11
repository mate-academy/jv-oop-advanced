package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    private static final int MAX_VALUE = 10;
    private static final int RADIUS_DEFAULT = 10;
    //max value of parameters (radius, size etc.) of figures

    public Figure getRandomFigure() {
        int indexOfFigures = new Random().nextInt(GeometricFigures.values().length);
        //chose random index of enum with GeometricFigures
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (GeometricFigures.values()[indexOfFigures]) {
            case SQUARE: {
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(new Random().nextInt(MAX_VALUE));
                return square;
            }
            case RECTANGLE: {
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(new Random().nextInt(MAX_VALUE));
                rectangle.setSecondSide(new Random().nextInt(MAX_VALUE));
                return rectangle;
            }
            case RIGHTTRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(new Random().nextInt(MAX_VALUE));
                rightTriangle.setSecondLeg(new Random().nextInt(MAX_VALUE));
                return rightTriangle;
            }
            case CIRCLE: {
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(new Random().nextInt(MAX_VALUE));
                return circle;
            }
            default: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setFirstBase(new Random().nextInt(MAX_VALUE));
                isoscelesTrapezoid.setSecondBase(new Random().nextInt(MAX_VALUE));
                isoscelesTrapezoid.setHigh(new Random().nextInt(MAX_VALUE));
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
