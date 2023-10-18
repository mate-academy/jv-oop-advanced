package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();
    private int figureNumber = random.nextInt(FIGURE_COUNT);
    private double dimension = Math.round((random.nextDouble() * 100) / 10);

    public Figure getRandomFigure() {
        switch (figureNumber) {
            case 0:
                return new Square(randomColor.getRandomColor(),dimension);
            case 1:
                return new RightTriangle(randomColor.getRandomColor(),dimension,dimension);
            case 2:
                return new Rectangle(randomColor.getRandomColor(),dimension,dimension);
            case 3:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        dimension,dimension,dimension);
            case 4:
                return new Circle(randomColor.getRandomColor(),dimension);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10.0);
    }
}
