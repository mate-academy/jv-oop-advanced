package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = new Figure[new Random().nextInt(10)];
        generateFigure(figures);
        print(figures);
    }

    public static Figure[] generateFigure(Figure [] figures) {
        FigureGenerator figureGenerator = new FigureGenerator();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureGenerator.get();
        }
        return figures;
    }

    public static void print(Figure [] figures) {
        for (Figure figure : figures) {
            figure.print();
        }
    }
}
