package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int index = random.nextInt(Figures.values().length);
        Figures figure = Figures.values()[index];

        switch (figure.name()) {
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * 100);
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * 100, random.nextDouble() * 100);
            case "RIGHT_TRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * 100,
                        random.nextDouble() * 100, random.nextDouble() * 100);
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 100);
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * 100,
                        random.nextDouble() * 100,
                        random.nextDouble() * 100);
            default:
                throw new IllegalStateException("Unexpected value: " + figure.name());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString(), 10);
    }
}
