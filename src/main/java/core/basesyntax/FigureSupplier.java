package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_LENGTH = 100;

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        Figure[] arrayOfFigures = {new Circle(getRandomLength(), color),
                new Rectangle(getRandomLength(), getRandomLength(), color),
                new Square(getRandomLength(), color),
                new IsoscelesTrapezoid(getRandomLength(),
                        getRandomLength(), getRandomLength(), color),
                new RightTriangle(getRandomLength(), getRandomLength(), color)};
        return arrayOfFigures[new Random().nextInt(arrayOfFigures.length)];
    }

    public Figure getDefaultFigure() {
        int defaultRadius = 10;
        return new Circle(defaultRadius, Color.WHITE.name());
    }

    private int getRandomLength() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_LENGTH);
    }
}
