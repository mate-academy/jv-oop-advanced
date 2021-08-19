package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[random.nextInt(15)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColor(colorSupplier.getRandomColor());
            figures[i].draw();
        }
    }
}


