package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int randomMassLength = figureSupplier.randomProperty();
        Figure[] figures = new Figure[randomMassLength];

        for (int i = 0;i < randomMassLength;i++) {
            figures[i] = figureSupplier.randomFigure();
            System.out.println(figures[i].draw(figures[i]));
        }
    }
}
