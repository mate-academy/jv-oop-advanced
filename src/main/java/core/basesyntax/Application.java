package core.basesyntax;

public class Application {
    public static void main(String [] main) {

        FigureSupplier figurS = new FigureSupplier();
        Figure w = new Circle();
        w = figurS.getDefaultFigure();
        System.out.println(w.draw());

    }
}
