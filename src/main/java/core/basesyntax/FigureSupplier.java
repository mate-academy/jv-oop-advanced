package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();



    public Figure getRandomFigure() {
        RightTriangle rightTriangle = new RightTriangle();
        return rightTriangle.getRandomRightTriangle();
    }

    public Figure getDefaultFigure(){
        Figure defaultFigure = new Сircle("white", 10);
        return defaultFigure;
    }
}
