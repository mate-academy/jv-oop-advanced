package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_VALUE_FOR_FIGURES = 25;
    private static final Random random = new Random();

    private static int getRandomNumber() {
        return random.nextInt(MAX_VALUE_FOR_FIGURES) + 1;
    }

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{new Circle("circle", getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_FIGURES)),
                new Rectangle("rectangle", getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber()),
                new RightTriangle("triangle", getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber()),
                new IsoscelesTrapezoid("isosceles trapezoid", getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber()),
                new Square("square", getRandomColor(), getRandomNumber())};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", "white", 10);
    }
}
