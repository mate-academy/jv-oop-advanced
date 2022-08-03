package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figures defaultFigure = figureSupplier.getDefaultFigure();

        Figures[] figureArray = new Figures[6];
        for (int i = 0; i < figureArray.length / 2; i++) {
            Figures randomFigure = figureSupplier.getRandomFigure();
            figureArray[i] = randomFigure;
        }
        for (int k = figureArray.length / 2; k < figureArray.length; k++) {
            figureArray[k] = defaultFigure;
        }
        for (Figures mass : figureArray) {
            mass.getDraw();
        }

    }
}
