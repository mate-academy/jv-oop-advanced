package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    
    public static void main(String[] args) {
        int figureside = 10;
        Figure[] figures = new Figure[new Random().nextInt(figureside)];
        
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
