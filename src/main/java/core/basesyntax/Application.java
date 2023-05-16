package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for(int i = 0; i < figures.length/2; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for(int i = figures.length/2;i < figures.length; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
