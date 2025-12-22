package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int sizeArray = 4;
        Figure[] figures = new Figure[sizeArray];
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();

        for(int i = 0; i < sizeArray / 2; i++){ //make half array random generation
            figures[i] = figureSupplier.getRandomFigure(colorSupplier.getRandomColor());
        }

        figures[2] = new Circle(5, "Black"); //example manual creating
        figures[3] = new IsoscelesTrapezoid(3,5, "White");

        for(Figure figure : figures){
            System.out.println(figure.draw());
        }
    }
}
