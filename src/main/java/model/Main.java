package model;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[5];
        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            System.out.println((i + 1) + ". Figure: " + figure[i].draw());
        }
        for (int i = 3; i < 5; i++) {
             figure[i].draw();
        }
    }
}

