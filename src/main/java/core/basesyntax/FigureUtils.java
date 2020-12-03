package core.basesyntax;

import core.basesyntax.figure.Figure;

public class FigureUtils {

    public void print(Figure figure) {
        System.out.println("Figure: " + figure.toString());
    }

    public void print(Figure[] figures) {
        java.util.Arrays.stream(figures).forEach(this::print);
    }
}
