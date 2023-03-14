package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int length = 10;
        Figure[] figures = new Figure[length];

        for (int i = 0; i < length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(); 
        }

        for (int i = length / 2; i < length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }

}
