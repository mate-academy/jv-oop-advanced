package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        double generatedDouble = Math.ceil(Math.random() * 10);

        Figure[] figuresArray = new Figure[(int) generatedDouble];
        //FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = (Figure) new FigureSupplier().getRandomFigure();
            figuresArray[i].draw();
        }

    }
}
