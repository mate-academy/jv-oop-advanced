package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int FIGURE_NUMBER = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure [] figure = new Figure[FIGURE_NUMBER];
        figure[0] = new Square(random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        figure[1] = new Circle(random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        figure[2] = new IsoscelesTrapezoid(random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        figure[3] = new Rectangle(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        figure[4] = new RightTriangle(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        return figure[random.nextInt(figure.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Colors.WHITE.name().toLowerCase());
    }
}
