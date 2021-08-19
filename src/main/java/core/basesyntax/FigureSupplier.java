package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBERS = 5;

    public Figure getRandomFigure() {
        Figure figure;

        switch (new Random().nextInt(MAX_NUMBERS) + 1) {
            case 1:
            default:
                figure = new Square();
                break;
            case 2:
                figure = new Rectangle();
                break;
            case 3:
                figure = new RightTriangle();
                break;
            case 4:
                figure = new Circle();
                break;
            case 5:
                figure = new IsoscelesTrapezoid();
                break;
        }
        return figure;
    }
}
