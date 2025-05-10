package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIDE_SIZE = 100.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        switch (Figures.values()[random.nextInt(Figures.values().length)].name()) {
            case "Square": figure = new Square(colorSupplier.getRandomColor(), random.nextDouble()
                    * MAX_SIDE_SIZE);
            break;
            case "Rectangle": figure = new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIDE_SIZE, random.nextDouble() * MAX_SIDE_SIZE);
            break;
            case "RightTriangle": figure = new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIDE_SIZE, random.nextDouble() * MAX_SIDE_SIZE);
            break;
            case "Circle": figure = new Circle(colorSupplier.getRandomColor(), random.nextDouble()
                    * MAX_SIDE_SIZE);
            break;
            // default used for "IsoscelesTrapezoid":
            default: figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIDE_SIZE, random.nextDouble() * MAX_SIDE_SIZE,
                    random.nextDouble() * MAX_SIDE_SIZE);
            break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10.0);
    }
}
