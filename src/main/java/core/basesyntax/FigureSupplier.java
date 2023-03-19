package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private Random random = new Random();
    private int numOfFigure;

    public Figure getRandomFigure() {
        Figure rend;
        numOfFigure = random.nextInt(AMOUNT_OF_FIGURES);

        switch (numOfFigure) {
            case 1:
                rend = new Rectangle();
                break;
            case 2:
                rend = new Circle("White", 10);
                rend.getArea();
                break;
            case 3:
                rend = new IsoscelesTrapezoid();
                rend.getArea();
                break;
            case 4:
                rend = new Square();
                rend.getArea();
                break;
            case 5:
                rend = new RightTriangle();
                rend.getArea();
                break;

            default:
                rend = new RightTriangle();
        }

        return rend;
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        Circle rend = new Circle("White", radius);
        return rend;
    }
}
