package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                null, null, null,
                new Square("cyan", 9),
                new Circle("pink", 6),
                new Rectangle("indigo", 6, 9)
        };
        FigureSupplier figureSupplier = new FigureSupplier();
        int figuresLength = figures.length;
        for (int i = 0; i < figuresLength; i++) {
            if (i < figuresLength / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
