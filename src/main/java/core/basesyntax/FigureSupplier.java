package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private static final int DEFAULT_NUMBER = 10;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private String defaultColor = String.valueOf(Color.WHITE);

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle(color.getRandomColor(), random.nextInt(MAX)),
                new Rectangle(color.getRandomColor(), random.nextInt(MAX), random.nextInt(MAX)),
                new RightTriangle(color.getRandomColor(), random.nextInt(MAX), random.nextInt(MAX)),
                new IsoscelesTrapezoid(color.getRandomColor(), random.nextInt(MAX),
                        random.nextInt(MAX), random.nextInt(MAX)),
                new Square(color.getRandomColor(), random.nextInt(MAX))
        };
        int index = random.nextInt(figures.length);
        Figure figure = figures[index];
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure[] figures = new Figure[]{
                new Circle(defaultColor, DEFAULT_NUMBER),
                new Square(defaultColor, DEFAULT_NUMBER),
                new Rectangle(defaultColor, DEFAULT_NUMBER, DEFAULT_NUMBER),
                new RightTriangle(defaultColor, DEFAULT_NUMBER, DEFAULT_NUMBER),
                new IsoscelesTrapezoid(defaultColor, DEFAULT_NUMBER,
                        DEFAULT_NUMBER, DEFAULT_NUMBER),
        };
        int index = random.nextInt(figures.length);
        Figure figure = figures[index];
        return figure;
    }
}
