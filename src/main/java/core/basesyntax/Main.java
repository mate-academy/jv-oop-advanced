package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure x = FigureSupplier.getFigure();
        System.out.println(x.getDraw());
    }
}
