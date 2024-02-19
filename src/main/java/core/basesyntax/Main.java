package core.basesyntax;

public class Main {
    private static int figureCount = 6;
    private static FigureSupplier figure = new FigureSupplier();

    public static void main(String[] args) {
        Figure [] figuresArray = new Figure[figureCount];
        for (int i = 0; i < figureCount; i++) {
            figuresArray[i] = (i < 3) ? figure.getRandomFigure() : figure.getDeafultFigure();
        }
        for (Figure figure : figuresArray) {
            System.out.println(figure.draw());
        }
    }
}
