package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure figore = new FigureSupplier().getRandomFigure();
        Figure figore2 = new FigureSupplier().getRandomFigure();
        Figure figore3 = new FigureSupplier().getRandomFigure();
        Figure figore4 = new FigureSupplier().getRandomFigure();
        Figure figore5 = new FigureSupplier().getRandomFigure();
        Figure[] figures = new Figure[] {figore, figore2, figore3, figore4, figore5};
        for (Figure figure: figures) {
            figure.drawFigure();
        }
    }
}
