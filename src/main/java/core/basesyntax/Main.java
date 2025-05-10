package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        double generatedDouble = Math.ceil(Math.random() * 10);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[(int) generatedDouble];
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
            figuresArray[i].draw();
        }
    }
}
