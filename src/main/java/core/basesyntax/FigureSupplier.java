package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final Random random = new Random();

    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0: return new Circle(color, randomSize());

            case 1: return new Rectangle(color, randomSize(), randomSize());

            case 2: return new RightTriangle(color, randomSize(), randomSize());

            case 3: return new Square(color, randomSize());

            default: return new IsoscelesTrapezoid(color, randomSize(), randomSize(), randomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private int randomSize() {
        return random.nextInt(20) + 1;
    }

}
