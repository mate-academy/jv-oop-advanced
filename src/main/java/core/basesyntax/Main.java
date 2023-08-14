package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigure = new Figure[3];
        for (int i = 0; i < randomFigure.length; i++) {
            randomFigure[i] = figureSupplier.getRandom();
        }
        Figure defFigure = figureSupplier.getDefaultFigure();
        Figure[] figures = {randomFigure[0], randomFigure[1], randomFigure[2],
                defFigure, defFigure, defFigure};
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
