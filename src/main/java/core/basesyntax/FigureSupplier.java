package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int maxSize = 15;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(5);
        switch (randomIndex) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(maxSize));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setFirstSide(random.nextInt(maxSize));
                isoscelesTrapezoid.setSecondSide(random.nextInt(maxSize));
                isoscelesTrapezoid.setHeight(random.nextInt(maxSize));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstSide(random.nextInt(maxSize));
                rectangle.setSecondSide(random.nextInt(maxSize));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(maxSize));
                rightTriangle.setSecondLeg(random.nextInt(maxSize));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 4:
                Square square = new Square();
                square.setSide(random.nextInt(maxSize));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("white");
        circle.setRadius(10);
        return circle;
    }
}
