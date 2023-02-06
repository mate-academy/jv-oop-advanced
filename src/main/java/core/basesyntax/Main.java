package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = {supplier.getRandomSquare(), supplier.getRandomRectangle(),
                supplier.getRandomTrapezoid(),supplier.getRandomTriangle(),
                supplier.getRandomRectangle(), supplier.getRandomCircle(),
                supplier.getRandomTriangle()};
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
