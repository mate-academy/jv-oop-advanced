package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public  Figure getRandomFigure() {
        int index = new Random().nextInt(FigureSelector.values().length);
       // return Color.values()[index].toString();
    }
}
