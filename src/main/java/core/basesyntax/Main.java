package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figureArray = new Figure[(int)Math.random() * 15 + 10];

        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = new FigureSupplier().figureGenerator();
            figureArray[i].drawFigure();
        }
    }
}
