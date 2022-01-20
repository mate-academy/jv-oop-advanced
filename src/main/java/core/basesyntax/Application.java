package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int sizeArray = 6;
        Figure[] figures = new Figure[sizeArray];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < sizeArray / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = sizeArray / 2; i < sizeArray; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
