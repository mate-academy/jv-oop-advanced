package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier[] figure = new FigureSupplier[] {new Square(), new IsoscelesTrapezoid(),
                new Rectangle(), new Circle(), new RightTriangle()};
        for (FigureSupplier result : figure) {
            System.out.println(result.getRandomFigure().getText());
        }
    }
}

