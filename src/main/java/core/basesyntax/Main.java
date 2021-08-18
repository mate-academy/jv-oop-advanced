package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int randomLength = (int) (Math.random() * 10);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figurs = new Figure[randomLength];
        for (int i = 0; i < figurs.length; i++) {
            figurs[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figur : figurs) {
            if (figur != null) {
                System.out.println(figur.getDrow());
            }
        }
    }
}
