package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String[] figures = new String[]{"circle", "trapezoid", "rectangle", "triangle", "square"};
    ColorSupplier colorSupplier = new ColorSupplier();
    private final int MAGIC_NUMBER = 20;
    private final Random random = new Random();
    public Figure getRandomFigure() {
        switch (figures[random.nextInt(figures.length - 1)]) {
            case "circle":
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAGIC_NUMBER));
            case "trapezoid":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAGIC_NUMBER), random.nextInt(MAGIC_NUMBER), random.nextInt(MAGIC_NUMBER));
            case "rectangle":
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAGIC_NUMBER), random.nextInt(MAGIC_NUMBER));
            case "triangle":
                return  new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAGIC_NUMBER), random.nextInt(MAGIC_NUMBER));
            case "square":
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAGIC_NUMBER));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
