package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LIMIT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomCase = random.nextInt(FIGURE_LIMIT) + 1;
        Figure figure = null;
        switch (randomCase) {
            case 1:
                figure = new Circle();
                break;
            case 2:
                figure = new IsoscelesTrapezoid();
                break;
            case 3:
                figure = new Rectangle();
                break;
            case 4:
                figure = new RightTriangle();
                break;
            case 5:
                figure = new Square();
                break;
            default:
                break;
        }
        return figure;
    }
}

