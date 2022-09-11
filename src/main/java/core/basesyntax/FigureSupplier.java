package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public int getRandomFigure(){
        int index = new Random().nextInt(15);
        return index + 8;
    }

    public Circle getDefaultFigure() {
        Circle defCircle = new Circle();
        defCircle.setName("circle");
        defCircle.setRadius(10);
        return defCircle;
    }
}
