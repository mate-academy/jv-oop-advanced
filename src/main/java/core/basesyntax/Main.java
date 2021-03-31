package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int countFigure = 15;
        Figure[] figureArray = new Figure[(int)(Math.random() * countFigure) + 1];

        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = new FigureSupplier().figureGenerator();
            figureArray[i].drawFigure();
        }
    }
}
