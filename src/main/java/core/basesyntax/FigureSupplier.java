package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int ARRAY_LENGTH = 5;
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{ new Circle(random.nextInt() + 1),
                new Square(random.nextInt() + 1),
                new Rectangle(random.nextInt() + 1, random.nextInt() + 1),
                new RightTriangle(random.nextInt() + 1, random.nextInt() + 1),
                new IsoscelesTrapezoid(random.nextInt() + 1, random.nextInt() + 1,
                        random.nextInt() + 1)};
        return figures[random.nextInt(ARRAY_LENGTH)];
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor("white");
        return circle;
    }
}



