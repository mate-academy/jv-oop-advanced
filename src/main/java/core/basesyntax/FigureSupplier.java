package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        Figures figures = Figures.values()[random.nextInt(Figures.values().length)];
        int sideA = random.nextInt(10) + 1;
        int sideB = random.nextInt(10) + 1;
        int sideC = random.nextInt(10) + 1;
        int radius = random.nextInt(10) + 1;
        int index = sideA - (sideB + 2 * sideC);

        switch (figures) {
            case SQUARE:
                figure = new Square("square",
                        supplier.getRandomColor(),
                        sideA);
                break;
            case RECTANGLE:
                figure = new Rectangle("rectangle",
                        supplier.getRandomColor(),
                        sideA,
                        sideB);
                break;
            case ISOSCELES_TRAPEZOID:
                if (index >= 0) {
                    while (index >= 0) {
                        sideB = random.nextInt(10) + 1;
                        sideC = random.nextInt(10) + 1;
                        index = sideA - (sideB + 2 * sideC);
                    }
                }
                if (sideA < sideB) {
                    figure = new IsoscelesTrapezoid("isoscelesTrapezoid",
                            supplier.getRandomColor(),
                            sideB,
                            sideA,
                            sideC);
                    break;
                } else {
                    figure = new IsoscelesTrapezoid("isoscelesTrapezoid",
                            supplier.getRandomColor(),
                            sideA,
                            sideB,
                            sideC);
                    break;
                }
            case CIRCLE:
                figure = new Circle("circle",
                        supplier.getRandomColor(),
                        radius);
                break;
            case TRIANGLE:
                figure = new RightTriangle("rightTriangle",
                        supplier.getRandomColor(),
                        sideA,
                        sideB);
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", "WHITE", 10);
    }
}
