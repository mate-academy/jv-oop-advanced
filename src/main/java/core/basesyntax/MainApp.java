package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        int size = 6;
        Figure[] figures = new Figure[size];
        int i = 0;
        FigureSupplier figureSupplier = new FigureSupplier();
        while (i < size) {
            figures[i] = i < size / 2 ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
            i++;
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
