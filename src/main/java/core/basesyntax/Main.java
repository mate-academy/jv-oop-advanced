package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();


        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = i < (figureArray.length / 2) ? figureSupplier.getRandomFigure() 
                                             : figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figuresArray) {
            figure.getDraw();
        }
    }
}
