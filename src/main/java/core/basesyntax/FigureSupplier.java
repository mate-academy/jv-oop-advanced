package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public double getSide() {
        double sideSize = random.nextInt(FIGURE_COUNT) + 1;
        return sideSize;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        Figure figure = null;
        switch (figureNumber) {
            case 1:
                figure = triangle;
                break;
            case 2:
                figure = circle;
                break;
            case 3:
                figure = square;
                break;
            case 4:
                figure = rectangle;
                break;
            case 5:
                figure = trapezoid;
                break;
            default:
                figure = trapezoid;
        }
        return figure;

    }

    public void showFigure() {
        System.out.println(getRandomFigure().toString());
    }
}
