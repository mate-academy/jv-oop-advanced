package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                double radius = random.nextDouble();
                figure = new Circle(radius);
                break;
            case 2:
                double side = random.nextDouble();
                figure =  new Square(side);
                break;
            case 3:
                double a = random.nextDouble();
                double b = random.nextDouble();
                figure =  new Rectangle(a, b);
                break;
            case 4:
                double firstLeg = random.nextDouble();
                double secondLeg = random.nextDouble();
                figure =  new RightTriangle(firstLeg, secondLeg);
                break;
            default :
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        double radius = random.nextDouble();

        figure = new Circle(radius);
        figure.color = Color.WHITE;
        return figure;
    }
}
