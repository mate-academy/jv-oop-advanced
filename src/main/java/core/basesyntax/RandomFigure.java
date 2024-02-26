package core.basesyntax;

import java.util.Random;

public class RandomFigure {
    private static final int MAX_FIGURE_NUMBER = 5;
    private final Random random = new Random();
    private Figure figure;

    public Figure getRandomFigures() {

        switch (random.nextInt(MAX_FIGURE_NUMBER)) {
            case 0:
                figure = new Circle();
                break;
            case 1:
                figure = new IsoscelesTrapezoid();
                break;
            case 2:
                figure = new Rectangle();
                break;
            case 3:
                figure = new RightTriangle();
                break;
            case 4:
                figure = new Square();
                break;
            default:
                break;
        }
        return figure.getRandomFigure();
    }
}
