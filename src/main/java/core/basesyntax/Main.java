package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length;i++) {
            if (i < 5) {
                figures[i] = randomFigure.getDefaultFigure();
            } else {
                figures[i] = randomFigure.getRandomFigure();
            }
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}

