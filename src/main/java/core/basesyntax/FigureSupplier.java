package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Figure.defaultColor);
        circle.setRadius(10);
        return circle;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int indexOfFigure = random.nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (indexOfFigure) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(random.nextDouble() * 10);
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setSide(random.nextDouble() * 10, random.nextDouble() * 10);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setSide(random.nextDouble() * 10, random.nextDouble() * 10);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 4:
                Square square = new Square();
                square.setSide(random.nextDouble());
                square.setColor(colorSupplier.getRandomColor());
                return square;
            default:
                return null;
        }
    }
}
