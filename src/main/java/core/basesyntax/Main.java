package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FiguresNumber = 5;
        Drawable[] figures = new Drawable[FiguresNumber];
        Figure.FigureSupplier figureSupplier = new Figure.FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i == 0) {
                figures[i] = new Square();
            } else if (i == 1) {
                figures[i] = new Rectangle(figureSupplier, colorSupplier);
            } else if (i == 2) {
                figures[i] = new Circle(figureSupplier.getRandomFigure(),
                        colorSupplier.getRandomColor());
            } else if (i == 3) {
                figures[i] = new IsoscelesTrapezoid(figureSupplier, colorSupplier);
            } else {
                figures[i] = new RightTriangle();
            }
            figures[i].draw();
        }
    }
}

