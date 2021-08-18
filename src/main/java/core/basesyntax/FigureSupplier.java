package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureRandom = random.nextInt(FIGURE_COUNT);
        switch (figureRandom) {
            case 0:
                return new Circle(random.nextInt(40));
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(40),
                        random.nextInt(40), random.nextInt(40));
            case 2:
                return new Rectangle(random.nextInt(40), random.nextInt(40));
            case 3:
                return new RightTriangle(random.nextInt(40), random.nextInt(40));
            default:
                return new Square(random.nextInt(40));
        }
    }
}
