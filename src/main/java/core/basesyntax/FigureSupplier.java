package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        final int INIT_FIGURES = 5;
        final int MAX_SIZE = 100;
        switch (new Random().nextInt(INIT_FIGURES)) {
            case 0:
                return new Circle("circle", 
                        new ColorSupplier().getRandomColor(), 
                        new Random().nextInt(MAX_SIZE));
            case 1:
                return new IsoscelesTrapezoid("isosceles trapezoid", 
                        new ColorSupplier().getRandomColor(), 
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle("right triangle",
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 3:
                return new Rectangle("rectangle",
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE));
            case 4:
                return new Square("square",
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SIZE));
            default:
                throw new IllegalStateException("Unexpected value: "
                        + new Random().nextInt(INIT_FIGURES));
        }
    }

    public Figure getDefaultFigure() {
        final int INIT_RADIUS = 10;
        final String INIT_NAME = "circle";
        final String INIT_COLOR = "white";
        return new Circle(INIT_NAME, INIT_COLOR, INIT_RADIUS);
    }
}
