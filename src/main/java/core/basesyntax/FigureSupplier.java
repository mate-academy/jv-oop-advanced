package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int randomIndex = random.nextInt(5);

        switch (randomIndex) {
            case 0:
                return new Square("Square", color, 1 + random.nextDouble() * 9);
            case 1:
                return new Rectangle("Rectangle", color,
                        1 + random.nextDouble() * 9, 1 + random.nextDouble() * 9);
            case 2:
                return new RightTriangle("Right Triangle", color,
                        1 + random.nextDouble() * 9, 1 + random.nextDouble() * 9);
            case 3:
                return new Circle("Circle", color,1 + random.nextDouble() * 9);
            case 4:
                return new IsoscelesTrapezoid("Isosceles Trapezoid", color,
                        1 + random.nextDouble() * 9, 1 + random.nextDouble() * 9,
                        1 + random.nextDouble() * 9);
            default:
                return new Circle("Circle", "White", 10);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", "White", 10);
    }
}
