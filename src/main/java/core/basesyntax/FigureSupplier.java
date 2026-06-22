package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(5);

        switch (type) {
            case 0:
                return new Circle(color, randomSize());
            case 1:
                return new Square(color, randomSize());
            case 2:
                return new Rectangle(color, randomSize(), randomSize());
            case 3:
                return new RightTriangle(color, randomSize(), randomSize());
            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        randomSize(),
                        randomSize(),
                        randomSize());
            default:
                throw new IllegalStateException("Unknown figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("" + Colors.WHITE, 10);
    }

    private int randomSize() {
        return random.nextInt(30) + 1;
    }
}
