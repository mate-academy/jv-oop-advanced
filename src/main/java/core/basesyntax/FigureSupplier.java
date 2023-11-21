package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String[] figures = new String[]{"circle", "trapezoid", "rectangle",
            "triangle", "square"};
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int magicNumber = 20;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (figures[random.nextInt(figures.length - 1)]) {
            case "circle":
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(magicNumber));
            case "trapezoid":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(magicNumber),
                        random.nextInt(magicNumber), random.nextInt(magicNumber));
            case "rectangle":
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(magicNumber),
                        random.nextInt(magicNumber));
            case "triangle":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(magicNumber),
                        random.nextInt(magicNumber));
            case "square":
                return new Square(colorSupplier.getRandomColor(), random.nextInt(magicNumber));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
