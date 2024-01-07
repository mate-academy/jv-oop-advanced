package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUES_OF_SIDE = 20;
    private static final int MAX_RADIUS = 15;
    private static final int UNIQUE_RADIUS = 10;

    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private Figure circleUnique = new Circle(UNIQUE_RADIUS, Color.white.name());

    private Figure[] figures = {
            new Rectangle(randomNumber(), randomNumber(), color.getRandomColor()),
            new Circle(random.nextInt(MAX_RADIUS), color.getRandomColor()),
            new Square(randomNumber(), color.getRandomColor()),
            new RightTriangle(randomNumber(), randomNumber(), color.getRandomColor()),
            new IsoscelesTrapezoid(randomNumber(), randomNumber(), randomNumber(),
                    color.getRandomColor())
    };

    public int randomNumber() {
        return random.nextInt(MAX_VALUES_OF_SIDE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return circleUnique;
    }
}
