package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int value = random.nextInt(4);
        String color = colorSupplier.getRandomColor();

        switch (value) {
            case 0: {
                return new IsoscelesTrapezoid(color, random.nextInt(), random.nextInt(), random.nextInt());
            }
            case 1: {
                return new Circle(color, random.nextInt());
            }
            case 2: {
                return  new RightTriangle(color, random.nextInt(), random.nextInt());
            }
            case 3: {
                return new Rectangle(color, random.nextInt(), random.nextInt());
            }
            case 4: {
                return new Square(color, random.nextInt());
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
