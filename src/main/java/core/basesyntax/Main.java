package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier x = new FigureSupplier();

        //Figure x = new Square(10);
        System.out.println(x.getRandomFigure().toString());
        //Figure y = new Square(110);
        //System.out.println(y.toString());
    }
}