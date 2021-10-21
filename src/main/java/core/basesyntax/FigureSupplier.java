package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        int value = random.nextInt(4);
        Figure figure = null;
        switch (value) {
            case 0:
                figure = new Circle();
                break;
            case 1:
                figure = new Square();
                break;
            case 2:
                figure = new IsoscelesTrapezoid();
                break;
            case 3:
                figure = new RightTriangle();
                break;
            default:
        }
        return figure;
    }

    public static Figure getDefaultFigure() {
        return new Circle(10,"White");
    }
}
