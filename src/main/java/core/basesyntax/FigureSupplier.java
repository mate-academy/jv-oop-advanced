package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_NUMBER = 50;
    private static final int FIGURES_NUMBER = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.toString().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_NUMBER);
        Figure figure;
        switch (figureNumber) {
            case 0:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND_NUMBER));
                break;
            case 1:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND_NUMBER), random.nextInt(BOUND_NUMBER));
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND_NUMBER), random.nextInt(BOUND_NUMBER));
                break;
            case 3:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND_NUMBER), random.nextInt(BOUND_NUMBER),
                        random.nextInt(BOUND_NUMBER));
                break;
            default:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND_NUMBER));
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        return circle;
    }

}

