package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6; 
    
    public static void main(String[] args) {

        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
