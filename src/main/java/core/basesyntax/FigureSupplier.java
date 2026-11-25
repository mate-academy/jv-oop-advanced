package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        String color = colorSupplier.getRandomColor();

        int randomValue = random.nextInt(1, 100);
        int randomValue1 = random.nextInt(1, 100);
        int randomValue2 = random.nextInt(1, 100);

        int randomIndex = random.nextInt(0, 5);
        switch (randomIndex) {
            case 0:
                Circle circle = new Circle(color, randomValue);
                return circle;
            case 1:
                Rectangle rectangle = new Rectangle(color, randomValue, randomValue1);
                return rectangle;
            case 2:
                Square square = new Square(color, randomValue);
                return square;
            case 3:
                RightTriangle rightTriangle = new RightTriangle(color, randomValue, randomValue1);
                return rightTriangle;
            case 4:
                ІsoscelesTrapezoid isoscelesTrapezoid = new ІsoscelesTrapezoid(color, randomValue, randomValue1, randomValue2);
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        String white = Color.WHITE.name();
        Circle circle = new Circle(white, 10);
        return circle;
    }
}
