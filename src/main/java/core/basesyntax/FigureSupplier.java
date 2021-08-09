package core.basesyntax;

public class FigureSupplier {
    public static final int FIGURE_TYPES = 5;
    public static final int SIDE_MAX = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = (int) Math.floor(Math.random() * FIGURE_TYPES);
        int sideA = (int) Math.floor(Math.random() * SIDE_MAX + 1);
        int sideB = (int) Math.floor(Math.random() * SIDE_MAX + 1);
        int sideC = (int) Math.floor(Math.random() * SIDE_MAX + 1);
        Figure figure;
        switch (figureNumber) {
            case 0:
                figure = new Square(sideA,colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(sideA,sideB,colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(sideA,sideB,colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Circle(sideA,colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(sideA,sideB,sideC,colorSupplier.getRandomColor());
                break;
            default:
                figure = new Square(sideA,colorSupplier.getRandomColor());
        }
        return figure;
    }
}
