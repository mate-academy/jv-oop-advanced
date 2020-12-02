package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(20)];
        for (Figure i : figures) {
            i = new CountFigure().get();
            i.draw();
        }
    }
}
