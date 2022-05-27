package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES_IN_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figureList = new Figure[NUMBER_OF_FIGURES_IN_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figureList.length; i++) {
            figureList[i] = i < figureList.length / 2 ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
        }
        System.out.println(figureList.length);
        for (Figure figureInfo: figureList) {
            figureInfo.draw();
        }
    }
}
