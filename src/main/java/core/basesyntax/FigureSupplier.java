package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure(){
        Random randomFigure = new Random();
        Figure figure = new Figure();
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle();
        return circle;
    }
}
