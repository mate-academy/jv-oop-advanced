package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure first = new FigureSupplier().getDefaultFigure();
        System.out.println(first.draw());
    }
}
