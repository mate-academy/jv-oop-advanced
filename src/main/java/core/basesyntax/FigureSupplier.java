package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();


    public Square getRandomFigure() {
        return new Square(getSide(), colorSupplier.getRandomColor()) ;
    }

    public Figure getDefaultFigure(){
        return null;
    }

    private int getSide() {
        return random.nextInt(1000);
    }
}
