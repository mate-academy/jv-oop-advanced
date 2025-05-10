package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        System.out.println(figure.getRandomFigure().getInfo());
    }
}
