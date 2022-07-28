package core.basesyntax;

public class Main {
    private static final int FIGURE_SIZE = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] figureArray = new String[FIGURE_SIZE];
        figureArray[0] = figureSupplier.getDefaultFigure().getDraw();
        figureArray[1] = figureSupplier.getRandomFigure().getDraw();
        figureArray[2] = figureSupplier.getRandomFigure().getDraw();
        for (int i = 0; i < figureArray.length; i++) {
            System.out.println(figureArray[i]);
        }
    }
}
