package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_PROPERTY_SIZE = 5;
    private static final Color DEFAULT_COLOR = Color.RED;
    private static final int NUMBER_OF_FIGURES = 5;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color thisFiguresColor = colorSupplier.getRandomColor();
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            default:
                return new Square(thisFiguresColor,
                        new Random().nextInt(Square.MAX_SIDE));
            case 0:
                return new Circle(thisFiguresColor,
                        new Random().nextInt(Circle.MAX_RADIUS));
            case 1:
                return new Rectangle(thisFiguresColor,
                        new Random().nextInt(Rectangle.MAX_SIDE_A),
                        new Random().nextInt(Rectangle.MAX_SIDE_B));
            case 2:
                return new RightTriangle(thisFiguresColor,
                        new Random().nextInt(RightTriangle.MAX_LEFT_LEG),
                        new Random().nextInt(RightTriangle.MAX_RIGHT_LEG));
            case 3:
                return new IsoscelesTrapezoid(thisFiguresColor,
                        new Random().nextInt(IsoscelesTrapezoid.MAX_BOTTOM_BASE),
                        new Random().nextInt(IsoscelesTrapezoid.MAX_TOP_BASE),
                        new Random().nextInt(IsoscelesTrapezoid.MAX_HIGHT));
        }
    }

    public Figure getDefaultFigure() {
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            default:
                return new Square(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE);
            case 0:
                return new Circle(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE);
            case 1:
                return new Rectangle(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE);
            case 2:
                return new RightTriangle(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE);
            case 3:
                return new IsoscelesTrapezoid(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE);
        }
    }
}
