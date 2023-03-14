package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int length = 100;
        Figure[] figures = new Figure[length];

        for (int i = 0; i < length / 2; i++) {
            figures[i] = FigureSupplier.getRandomFigure(); 
        }

        for (int i = length / 2; i < length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }

}
