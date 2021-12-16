package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                double rnd = (Math.random() * 10 + 1);
                return new Square(rnd);
            case 1:
                double rnd2 = (Math.random() * 10 + 1);
                return new Circle(rnd2);
            case 2:
                double rnd3 = (Math.random() * 10 + 1);
                double rnd4 = (Math.random() * 10 + 1);
                return new Triangle(rnd3, rnd4);
            case 3:
                double rnd5 = (Math.random() * 10 + 1);
                double rnd6 = (Math.random() * 10 + 1);
                return new Trapezoid(rnd5, rnd6);
            default:
                double rnd7 = (Math.random() * 10 + 1);
                return new Square(rnd7);
        }
    }
}
