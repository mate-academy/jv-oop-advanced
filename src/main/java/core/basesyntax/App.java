package core.basesyntax;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Figure[] resultArray = new Figure[6];
        FigureSupplier figure = new FigureSupplier();
        Random random = new Random();
        Figures[] figures = Figures.values();
        for (int i = 0; i < 6; i++) {
            if (i < figures.length / 2) {
                Figure getFigure = figure.getRandomFigure(figures[random.nextInt(figures.length)]);
                resultArray[i] = getFigure;
                getFigure.drawFigure();
            } else {
                Figure defaultFigure = figure.getDefaultFigure();
                resultArray[i] = defaultFigure;
                defaultFigure.drawFigure();
            }
        }
    }
}
