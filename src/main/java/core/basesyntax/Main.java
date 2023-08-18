package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length / 2; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
            figuresArray[i].getFigure();
        }
        figuresArray[3] = new RightTriangle("RightTriangle", "red", 5, 5);
        figuresArray[3].getFigure();
        figuresArray[4] = new Circle("Circle", "blue", 5);
        figuresArray[4].getFigure();
        figuresArray[5] = new Square("Square", "balck", 3);
        figuresArray[5].getFigure();
    }

}
