package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] list = new Figure [6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i <= 2; i++) {
            list[i] = figureSupplier.getRandomFigure();
            System.out.println(list[i].toString());
        }
        for (int i = 3; i <= 5; i++) {
            list[i] = figureSupplier.getDefaultFigure();
            System.out.println(list[i].toString());
        }
    }
}
