package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextDouble() * MAX_SIZE);
            case 1:
                return new Rectangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 2:
                return new RightTriangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
            case 3:
                return new Circle(color, random.nextDouble() * MAX_SIZE);
            default:
                return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE, random.nextDouble() * MAX_SIZE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
