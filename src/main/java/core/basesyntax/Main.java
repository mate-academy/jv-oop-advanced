package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier[] figures = new FigureSupplier[3];
        FigureSupplier firstFigure = new FigureSupplier();
        FigureSupplier secondFigure = new FigureSupplier();
        FigureSupplier thirdFigure = new FigureSupplier();
        final FigureSupplier fourthDefaultFigure = new FigureSupplier();
        figures[0] = firstFigure;
        figures[1] = secondFigure;
        figures[2] = thirdFigure;
        for (FigureSupplier i : figures) {
            i.getRandomFigure().draw();
        }
        fourthDefaultFigure.getDefaultFigure().draw();
    }
}
