package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square(randomColor.getRandomColor(), random.nextInt(101));
            case 2:
                return new Rectangle(randomColor.getRandomColor(),
                        random.nextInt(101), random.nextInt(101));
            case 3:
                return new RightTriangle(randomColor.getRandomColor(),
                        random.nextInt(101), random.nextInt(101));
            case 4:
                return new Circle(randomColor.getRandomColor(), random.nextInt(101));
            case 5:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101));
            default:
                return getDefaultFigure();
        }
    }
}
