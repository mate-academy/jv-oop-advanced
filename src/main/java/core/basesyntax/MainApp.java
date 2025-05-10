package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        AbstractFigure[] figures = new AbstractFigure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3;i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].describe());
        }
        for (int i = 3; i < 6;i++) {
            figures[i] = (AbstractFigure) figureSupplier.getDefaultFigure();
            System.out.println(figures[i].describe());
        }
    }
}
