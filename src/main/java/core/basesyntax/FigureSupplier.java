package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Figure figure = new Figure(colorSupplier.getRandomColor());
    private final int MAX_UNITS = 20;
    private final int DEFAULT_NUM = 10;

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(Color.values().length);
        switch (randomNumber) {
            case 0:
                figure = new Square(random.nextInt(MAX_UNITS) + 1,
                        colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(random.nextInt(MAX_UNITS) + 1,
                        random.nextInt(MAX_UNITS) + 1, colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(random.nextInt(MAX_UNITS) + 1,
                        random.nextInt(MAX_UNITS) + 1, colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Circle(random.nextInt(MAX_UNITS) + 1,
                        colorSupplier.getRandomColor());
                break;
            default:
                figure = new IsoscelesTrapezoid(random.nextInt(MAX_UNITS) + 1,
                        random.nextInt(MAX_UNITS) + 1, random.nextInt(MAX_UNITS) + 1,
                        colorSupplier.getRandomColor());
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NUM, "white");
    }
}
