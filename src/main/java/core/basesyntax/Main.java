package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure square = new Square(3, "red");
        Figure circle = figureSupplier.getDefoltFigure();
        Figure rectangle = new Rectangle(4, 5, "blue");

        Figure[] figures = new Figure[] {square, circle, rectangle};
        for (Figure figure : figures) {
            System.out.println(figure.printInfo());
        }

    }

}
