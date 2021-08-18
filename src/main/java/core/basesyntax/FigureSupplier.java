package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure figure;

        switch (new Random().nextInt(5) + 1) {
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
