package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier defaultFigure = new FigureSupplier();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            figures[i] = defaultFigure.getRandomFigure();
        }

        for (Figure figuresOut : figures) {
            System.out.println(figuresOut.draw());
        }
    }
}
