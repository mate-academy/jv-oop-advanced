package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier[] figuresArray = new FigureSupplier[5];
        for (FigureSupplier f : figuresArray) {
            Figure randomFigure = f.getRandomFigure();
            randomFigure.draw();
        }
    }
}
