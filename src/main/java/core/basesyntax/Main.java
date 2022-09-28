package core.basesyntax;

import core.basesyntax.figures.Rectangle;
import core.basesyntax.utils.FigureSupplier;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Rectangle("Red", 5, 4).getColor());
        System.out.println(new FigureSupplier(new Random()).getRandomFigure());
        System.out.println(new FigureSupplier(new Random()).getDefaultFigure());
    }
}
