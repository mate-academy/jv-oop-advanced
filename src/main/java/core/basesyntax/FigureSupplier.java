package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random randomizer = new Random();

    public Figure getDefaultFigure() {
        return (new Circle(Colors.WHITE,10));
    }

    public Figure getRandomFigure() {
        /*
        create random color index[0] - and figure segments length index[1-3]
        which use in figure class constructor
        */
        int[] index = new int[4];
        for (int i = 0; i < index.length; i++) {
            index[i] = randomizer.nextInt(100);
        }

        index[0] = index[0] % (Colors.values().length);

        int figureIndex = randomizer.nextInt(4);

        switch (figureIndex) {
            case 0:
                return (new Circle(Colors.values()[index[0]],index[1]));
            case 1:
                return (new Square(Colors.values()[index[0]],index[1]));
            case 2:
                return (new RightTriangle(Colors.values()[index[0]],index[1],index[2]));
            case 3:
                return (new Trapezoid(Colors.values()[index[0]],index[1],index[2],index[3]));
            default:
                return (new Circle(Colors.WHITE,10));
        }
    }

}
