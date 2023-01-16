package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresAll = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresAll.length; i++) {
            if(i < figuresAll.length / 2) {
                figuresAll[i] = figureSupplier.getRandomFigure();
                figuresAll[i].draw();
            }
            else {
                figuresAll[i] = figureSupplier.getDefaultFigure();
                figuresAll[i].draw();
            }
        }
    }
}
