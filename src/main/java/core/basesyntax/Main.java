package core.basesyntax;

import static core.basesyntax.FigureSupplier.getRandomFigure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int)(Math.random() * 10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigure();
            figures[i].draw();
        }
    }
}
