package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LOWWER_BOUND = 1;
    private static final int UPPER_BOUND = 101;
    private Random number = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        int bounds = (UPPER_BOUND - LOWWER_BOUND) + LOWWER_BOUND;
        Figure[] figures = {new Circle(colorSupplier.getRandomColor(),
                                    number.nextInt(bounds)),
                            new Square(colorSupplier.getRandomColor(),
                                    number.nextInt(bounds)),
                            new Rectangle(colorSupplier.getRandomColor(),
                                    number.nextInt(bounds),
                                    number.nextInt(bounds)),
                            new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                    number.nextInt(bounds),
                                    number.nextInt(bounds),
                                    number.nextInt(bounds)),
                            new RightTriangle(colorSupplier.getRandomColor(),
                                    number.nextInt(bounds),
                                    number.nextInt(bounds))};
        return figures[number.nextInt(figures.length)];
    }

}
