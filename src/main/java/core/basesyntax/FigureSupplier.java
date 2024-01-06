package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 9;
    private static final int DEFAULT_RADIUS = 10;
    private Figure randomFigure;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure(int randomIndex) {

        switch (randomIndex) {
            case 0:
                randomFigure = new Square(random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
                break;

            case 1:
                randomFigure = new IsoscelesTrapezoid(random.nextInt(MIN_SIZE, MAX_SIZE),
                        random.nextInt(MIN_SIZE, MAX_SIZE), random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
                break;
            case 2:
                randomFigure = new RightTriangle(random.nextInt(MIN_SIZE, MAX_SIZE),
                        random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
                break;

            case 3:
                randomFigure = new Circle(random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
                break;

            case 4:
                randomFigure = new Rectangle(random.nextInt(MIN_SIZE, MAX_SIZE),
                        random.nextInt(MIN_SIZE, MAX_SIZE),
                        new ColorSupplier().getRandomColor());
                break;
            default:
                randomFigure = new Circle(DEFAULT_RADIUS, Color.WHITE.name());
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
