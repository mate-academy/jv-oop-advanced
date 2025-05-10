package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextInt(10) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3:
                return new Circle(color, random.nextInt(10) + 1);
            case 4:
            default:
                return new IsoscelesTrapezoid(color, random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

