package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier cs = new ColorSupplier(random, Colors.values());
        FigureSupplier fs = new FigureSupplier(random, cs, Figures.values());

        Figure[] figuresArray = {fs.getRandomFigure(), fs.getRandomFigure(), fs.getRandomFigure(),
        fs.getDefaultFigure(), fs.getDefaultFigure(), fs.getDefaultFigure()};

        for (Figure figure : figuresArray) {
            System.out.println(figure.getInfo());
        }
    }
}
