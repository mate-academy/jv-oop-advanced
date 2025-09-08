package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(5); // 5 types of figures
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Circle(color, random.nextDouble() * 10 + 1);
            case 1:
                return new Square(color, random.nextDouble() * 10 + 1);
            case 2:
                return new Rectangle(color, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 3:
                return new RightTriangle(color, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

