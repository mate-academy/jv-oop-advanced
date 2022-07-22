package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureBasket = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figureBasket[i] = figureSupplier.getRandomFigure();
        }
        figureBasket[3] = new IsoscelesTrapezoid("green", 3, 4, 5);
        figureBasket[4] = new Circle("green", 3);
        figureBasket[5] = new Square(5, "yellow");

        for (int i = 0; i < 6; i++) {
            figureBasket[i].draw();
        }
    }
}
