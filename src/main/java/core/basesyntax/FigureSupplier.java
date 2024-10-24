package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(color, random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}

