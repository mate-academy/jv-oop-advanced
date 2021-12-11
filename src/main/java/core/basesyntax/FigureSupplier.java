package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random randomizer = new Random();

    public Figure getDefaultFigure() {
        return (new Circle(Colors.WHITE,10));
    }

    public Figure getRandomFigure() {
        int[] idx = new int[4];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = randomizer.nextInt(100);
        }

        idx[0] = idx[0] % (Colors.values().length);

        switch (idx[0] % 4) {
            case 0:
                return (new Circle(Colors.values()[idx[0]],idx[1]));
            case 1:
                return (new Square(Colors.values()[idx[0]],idx[1]));
            case 2:
                return (new RightTriangle(Colors.values()[idx[0]],idx[1],idx[2]));
            case 3:
                return (new Trapezoid(Colors.values()[idx[0]],idx[1],idx[2],idx[3]));
            default:
                return (new Circle(Colors.WHITE,10));
        }
    }

}
