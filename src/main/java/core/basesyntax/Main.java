package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                System.out.println(figuresArray[i].getDrawing());
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                System.out.println(figuresArray[i].getDrawing());
            }
        }
    }
}
