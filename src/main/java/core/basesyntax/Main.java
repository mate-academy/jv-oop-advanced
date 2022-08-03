package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figures defaultFigure = figureSupplier.getDefaultFigure();

        Figures[] figureArray = new Figures[6];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = i < (figureArray.length / 2) ? figureSupplier.getRandomFigure() 
                                             : figureSupplier.getDefaultFigure();
        }
        for (Figures mass : figureArray) {
            mass.getDraw();
        }

    }
}
