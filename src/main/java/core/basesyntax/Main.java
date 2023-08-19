package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        figureSupplier.getDefaultFigure().draw();

        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                figuresArray[i].draw();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                figuresArray[i].draw();
            }
        }
    }

}
