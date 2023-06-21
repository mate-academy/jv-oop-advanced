package core.basesyntax;

import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{new Figure().getDefaultFigure(), new Figure().getDefaultFigure(),
                new Figure().getDefaultFigure(), new Figure().getRandomFigure(), new Figure().getRandomFigure(),
                new Figure().getRandomFigure()};
        System.out.println(Arrays.toString(figures));
    }
}
