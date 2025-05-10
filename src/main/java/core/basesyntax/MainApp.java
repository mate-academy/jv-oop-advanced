package core.basesyntax;

public class MainApp {

    static FigureSupplier figureSupplier = new FigureSupplier();
    static Figure randomFigure = figureSupplier.getRandomFigure();
    static Figure defaultFigure = figureSupplier.getDefaultFigure();

    public static void main(Figure[] args) {
        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length - 1; i++) {
            figuresArray[i] = randomFigure;
        }
        figuresArray[2] = defaultFigure;
        System.out.println(figuresArray[0]);
        System.out.println(figuresArray[1]);
        System.out.println(figuresArray[2]);
    }
}
