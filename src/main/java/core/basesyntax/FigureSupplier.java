package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figureCount = 5;
    private final int randomFigureParameter = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNum = random.nextInt(figureCount);
        switch (randomFigureNum) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(randomFigureParameter));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomFigureParameter),
                        random.nextInt(randomFigureParameter));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomFigureParameter),
                        random.nextInt(randomFigureParameter));
            case 3:
                return new Circle(random.nextInt(randomFigureParameter),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(randomFigureParameter),
                        random.nextInt(randomFigureParameter),
                        random.nextInt(randomFigureParameter));
            default:
                throw new IllegalStateException("Unexpected value: " + randomFigureNum);
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(10,"WHITE");
        return figure;
    }
}
