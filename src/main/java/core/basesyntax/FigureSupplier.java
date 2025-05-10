package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RAND = 50;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();
        Random r = new Random();
        int chosenFigure = r.nextInt(FIGURE_COUNT);
        switch (chosenFigure) {
            case 0:
                return new Circle(randomColor, r.nextInt(MAX_RAND));
            case 1:
                return new Square(randomColor, r.nextInt(MAX_RAND));
            case 2:
                return new Rectangle(randomColor, r.nextInt(MAX_RAND), r.nextInt(MAX_RAND));
            case 3:
                return new RightTriangle(randomColor, r.nextInt(MAX_RAND), r.nextInt(MAX_RAND));
            default:
                return new IsoscelesTrapezoid(randomColor, r.nextInt(MAX_RAND), r.nextInt(MAX_RAND),
                        r.nextInt(MAX_RAND));
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
