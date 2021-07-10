package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    private final int sideLength = 5;

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 2:
                figure = new Rectangle(random.nextInt(sideLength), random.nextInt(sideLength));
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(sideLength), random.nextInt(sideLength));
                break;
            case 4:
                figure = new Circle(random.nextInt(sideLength));
                break;
            case 5:
                int a = random.nextInt(sideLength);
                int b = random.nextInt(sideLength);
                int c = random.nextInt(sideLength);
                figure = new IsoscelesTrapezoid((a > b) ? a : b, (a > b) ? b : a, c);
                break;
            default:
                figure = new Square(random.nextInt(sideLength));
                break;
        }
        return figure;
    }
}
