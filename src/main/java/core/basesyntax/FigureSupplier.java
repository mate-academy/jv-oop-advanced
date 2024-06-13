package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANGE_BOUND = 5;
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(RANGE_BOUND);
        switch (randomInt) {
            case 0:
                figure = new Square();
                break;
            case 1:
                figure = new Rectangle();
                break;
            case 2:
                figure = new RightTriangle();
                break;
            case 3:
                figure = new Circle();
                break;
            case 4:
                figure = new IsoscelesTrapezoid();
                break;
            default:
                break;
        }
        figure.randomizeProperty();
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        figure = circle;
        figure.setColor("White");
        return figure;
    }
}
