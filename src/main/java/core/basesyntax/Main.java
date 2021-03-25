package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int)(Math.random() * 10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.randomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
