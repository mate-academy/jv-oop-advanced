package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(10 - 5) + 5);
                return square;
            case 1:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(10 - 5) + 5);
                rightTriangle.setSecondLeg(random.nextInt(10 - 5) + 5);
                return rightTriangle;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setSideA(random.nextInt(10 - 5) + 5);
                rectangle.setSideB(random.nextInt(10 - 5) + 5);
                return rectangle;
            case 3:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setSideA(random.nextInt(10 - 5) + 5);
                isoscelesTrapezoid.setSideB(random.nextInt(10 - 5) + 5);
                isoscelesTrapezoid.setSideC(random.nextInt(10 - 5) + 5);
                return isoscelesTrapezoid;
            case 4:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(10 - 5) + 5);
                return circle;
            default:
                return null;
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
