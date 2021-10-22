package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        int arrayLenght = 1 + (int) (Math.random() * 11);
        Figure[] figures = new Figure[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
