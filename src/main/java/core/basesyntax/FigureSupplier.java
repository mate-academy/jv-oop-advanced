package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure figure = new Figure() {
            @Override
            public void draw() {

            }
        };

        switch (new Random().nextInt(4) + 1) {
            case 1:
                figure =  new Square();
                break;
        }
         return figure;
    }
}
