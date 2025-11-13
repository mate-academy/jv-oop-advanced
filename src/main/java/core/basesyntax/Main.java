package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] tablicaFigur = new Figure[6];
        for (int i = 0; i < tablicaFigur.length / 2; i++) {
            tablicaFigur[i] = figureSupplier.getRandomFigure();
        }
        for (int i = tablicaFigur.length / 2; i < tablicaFigur.length; i++) {
            tablicaFigur[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure f : tablicaFigur) {
            f.draw();
        }
    }
}
