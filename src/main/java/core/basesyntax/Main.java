package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier supplier = new FigureSupplier();
        Figure circle = supplier.getRandomFigure();
        Figure trapezoid = new IsoscelesTrapezoid(5,9, 4,"pink", "trapezoid");

        trapezoid.draw();
    }

}
