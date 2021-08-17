package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure figore = new Square(new ColorSupplier().getRandomColor(), 4);
        Rectangle figore2 = new Rectangle(new ColorSupplier().getRandomColor(), 5, 10);
        RightTriangle figore3 = new RightTriangle(new ColorSupplier().getRandomColor(), 11, 7);
        Circle figore4 = new Circle(new ColorSupplier().getRandomColor(), 3);
        IsoscelesTrapezoid figore5 = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), 5, 10, 5);
        Figure[] figures = new Figure[] {figore, figore2, figore3, figore4, figore5};
        for (Figure figure: figures) {
            figure.drawFigure();
        }
    }
}
