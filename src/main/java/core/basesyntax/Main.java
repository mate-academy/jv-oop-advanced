package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int randomLength = (int) (Math.random() * 10) + 1;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figurs = new Figure[randomLength];
        for (int i = 0; i < figurs.length; i++) {
            figurs[i] = figureSupplier.getRandomFigure();
            if (figurs[i] != null) {
                figurs[i].drow();
            }
        }
    }
}

