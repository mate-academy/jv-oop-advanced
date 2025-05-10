package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIDE = 10;
    private static final int FIGURE_COUNT = 4;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier cs = new ColorSupplier();
        switch (figureNumber) {
            case 0:
                double rnd = (Math.random() * SIDE + 1);
                return new Square(rnd, cs.getRandomColor());
            case 1:
                double rnd2 = (Math.random() * SIDE + 1);
                return new Circle(rnd2, cs.getRandomColor());
            case 2:
                double rnd3 = (Math.random() * SIDE + 1);
                double rnd4 = (Math.random() * SIDE + 1);
                return new Triangle(rnd3, rnd4, cs.getRandomColor());
            case 3:
                double rnd5 = (Math.random() * SIDE + 1);
                double rnd6 = (Math.random() * SIDE + 1);
                return new Trapezoid(rnd5, rnd6, cs.getRandomColor());
            default:
                double rnd7 = (Math.random() * SIDE + 1);
                return new Square(rnd7, cs.getRandomColor());
        }
    }
}
