package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_FIGURES = 5;
    static final int MAX_SIZE = 100;
    private Figure defaultFigure = new Circle("WHITE",10);
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_FIGURES)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
