package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigureOne = figureSupplier.getRandomFigure();
        Figure randomFigureTwo = figureSupplier.getRandomFigure();
        Figure defoltFigure = figureSupplier.getDefoltFigure();

        Figure[] figures = new Figure[] {randomFigureOne, randomFigureTwo, defoltFigure};
        for (Figure figure : figures) {
            System.out.println(figure.printInfo());
        }
    }
}
