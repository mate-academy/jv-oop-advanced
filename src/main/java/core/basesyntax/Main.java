package core.basesyntax;

public class Main {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figuresArray.length / 2; i++) {
            figuresArray[i] = new FigureSupplier().getRandomFigure();
            figuresArray[i].draw();
        }
        for (int k = figuresArray.length / 2; k < figuresArray.length; k++) {
            figuresArray[k] = new FigureSupplier().getDefaultFigure();
            figuresArray[k].draw();
        }
    }
}
