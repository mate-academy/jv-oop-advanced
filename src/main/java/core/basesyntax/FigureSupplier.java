package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = rand.nextInt(NUMBER_OF_FIGURE_TYPES);

        switch (figureType) {
            case 0:
                return new Square(color, rand.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(color,
                        rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(color,
                        rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1);
            case 3:
                return new Circle(color, rand.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color,
                        rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1);
            default:
                return new Circle(color, 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

