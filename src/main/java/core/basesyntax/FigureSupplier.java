package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INIT_RADIUS = 10;
    private static final String INIT_COLOR = "white";
    private static final int INIT_FIGURES = 5;
    private static final int MAX_SIZE = 100;

    public Figure getRandomFigure() {

        switch (new Random().nextInt(INIT_FIGURES)) {
            case 0:
                return new Circle(
                        new ColorSupplier().getRandomColor(), 
                        new Random().nextInt(MAX_SIZE));
            case 1:
                return new IsoscelesTrapezoid(
                        new ColorSupplier().getRandomColor(), 
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 3:
                return new Rectangle(
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 4:
                return new Square(
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE));
            default:
                throw new IllegalStateException("Unexpected value: "
                        + new Random().nextInt(INIT_FIGURES));
        }
    }

    public Figure getDefaultFigure() {

        return new Circle(INIT_COLOR, INIT_RADIUS);
    }
}
