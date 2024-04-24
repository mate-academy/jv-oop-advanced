package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].setArea();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].setArea();
            }
        }
        for (Figure element : figures) {
            element.draw();
        }
    }
}
