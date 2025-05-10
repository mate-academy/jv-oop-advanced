package core.basesyntax;

public class FigureSupplier {
    public static final int FIGURE_TYPES = 5;
    public static final int SIDE_MAX = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = (int) Math.floor(Math.random() * FIGURE_TYPES);
        int sideA = (int) Math.floor(Math.random() * SIDE_MAX + 1);
        int sideB = (int) Math.floor(Math.random() * SIDE_MAX + 1);
        int sideC = (int) Math.floor(Math.random() * SIDE_MAX + 1);
        switch (figureNumber) {
            case 0: return new Square(sideA,colorSupplier.getRandomColor());
            case 1: return new Rectangle(sideA,sideB,colorSupplier.getRandomColor());
            case 2: return new RightTriangle(sideA,sideB,colorSupplier.getRandomColor());
            case 3: return new Circle(sideA,colorSupplier.getRandomColor());
            case 4: return new IsoscelesTrapezoid(sideA,sideB,sideC,colorSupplier.getRandomColor());
            default: return new Square(sideA,colorSupplier.getRandomColor());
        }
    }
}
