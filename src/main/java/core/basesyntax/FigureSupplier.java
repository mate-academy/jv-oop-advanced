package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomFig = random.nextInt(5);
        switch (randomFig) {
            case 1 :
                figure = new Circle(colorSupplier.getRandomColor(), 5 + random.nextInt(5));
                break;
            case 2 :
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        5 + random.nextInt(5), 5 + random.nextInt(5));
                break;
            case 3 :
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        5 + random.nextInt(5), 5 + random.nextInt(5));
                break;
            case 4 :
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        5 + random.nextInt(5), 10 + random.nextInt(5),
                        5 + random.nextInt(5));
                break;
            default :
                figure = new Square(colorSupplier.getRandomColor(), 5 + random.nextInt(5));
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
