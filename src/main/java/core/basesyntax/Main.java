package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GeneratorFigure generator = new GeneratorFigure();
        Figure[] figures = new Figure[new Random().nextInt(5)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = generator.getFigure();
            System.out.println(figures[i].draw());
        }
    }
}
