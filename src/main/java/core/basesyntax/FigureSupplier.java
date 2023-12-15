package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        int randomNumber = random.nextInt(5); // random figure
        String color = ColorSupplier.getRandomColor(); // random color

        switch (randomNumber) {
            case 0:
                return new Square(random.nextDouble() * 10, color);
            case 1:
                return new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10, color);
            case 2:
                return new RightTriangle(random.nextDouble() * 10, random.nextDouble() * 10, color);
            case 3:
                return new Circle(random.nextDouble() * 10, color);
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10, random.nextDouble() * 10,
                        random.nextDouble() * 10, color);
            default:
                return null;
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}


