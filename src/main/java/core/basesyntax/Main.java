package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 5; i++) {
            if (i / 2 == 0) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure figure : figures) {
            figure.getPrintInfo();
        }
        /*Figure[] figure = new Figure[1];
        FigureSupplier figureSupplier = new FigureSupplier();
        figure[0] = figureSupplier.getDefaultFigure();
        figure[0].getPrintInfo();
        figure[0] = new RightTriangle(20,40,"black");
        figure[0].getPrintInfo();*/
    }
}
