package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        int lenghtArray = 1 + (int) (Math.random() * 11);
        Figure[] figures = new Figure[lenghtArray];
        for (int i = 0; i < lenghtArray; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
