package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomFigureType()) {
            case SQUARE:
                Square square = new Square();
                square.setColor(randomColor.getRandomColor());
                square.setSide(random.nextInt(MAX_VALUE));
                return square;
            case CIRCLE:
                Circle circle = new Circle();
                circle.setColor(randomColor.getRandomColor());
                circle.setRadius(random.nextInt(MAX_VALUE));
                return circle;
            case ISOSCELESTRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(randomColor.getRandomColor());
                isoscelesTrapezoid.setTopBase(random.nextInt(MAX_VALUE));
                isoscelesTrapezoid.setBottomBase(random.nextInt(MAX_VALUE));
                isoscelesTrapezoid.setSide(random.nextInt(MAX_VALUE));
                return isoscelesTrapezoid;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(randomColor.getRandomColor());
                rectangle.setSide(random.nextInt(MAX_VALUE));
                rectangle.setSecondSide(random.nextInt(MAX_VALUE));
                return rectangle;
            case RIGHTTRIANGLE:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(randomColor.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MAX_VALUE));
                rightTriangle.setSecondLeg(random.nextInt(MAX_VALUE));
                return rightTriangle;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureType.CIRCLE, Color.WHITE.name(), 10);
    }

    private FigureType getRandomFigureType() {
        int index = random.nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }
}
