package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int dimensionLimit = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figure = getRandomFigureFromEnum();
        switch (figure) {
            case CIRCLE:
                Circle circle = new Circle();
                circle.setRadius(getRandomDimension());
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setHeight(getRandomDimension());
                isoscelesTrapezoid.setTopSide(getRandomDimension());
                isoscelesTrapezoid.setBottomSide(isoscelesTrapezoid.getTopSide());

                while (isoscelesTrapezoid.getBottomSide() <= isoscelesTrapezoid.getTopSide()) {
                    isoscelesTrapezoid.setBottomSide(getRandomDimension());
                }

                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(getRandomDimension());
                rectangle.setWidth(getRandomDimension());
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(getRandomDimension());
                rightTriangle.setSecondLeg(getRandomDimension());
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case SQUARE:
                Square square = new Square();
                square.setSide(getRandomDimension());
                square.setColor(colorSupplier.getRandomColor());
                return square;
            default:
                return new Figure();
        }
    }

    private Figures getRandomFigureFromEnum() {
        int index = random.nextInt(Figures.values().length);
        Figures figure = Figures.values()[index];
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
        return circle;
    }

    private int getRandomDimension() {
        return random.nextInt(dimensionLimit);
    }
}
