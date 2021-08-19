package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure figure = new Circle();
        int figureNumber = (int) (1 + Math.random() * (6 - 1));
        switch (figureNumber) {
            case 1:
                figure = new Circle(Math.random() * 10);
                break;
            case 2:
                figure = new IsoscelesTrapezoid(Math.random() * 10,
                        Math.random() * 10,
                        Math.random() * 10);
                break;
            case 3:
                figure = new Rectangle(Math.random() * 10,
                        Math.random() * 10);
                break;
            case 4:
                figure = new RightTriangle(Math.random() * 10,
                        Math.random() * 10);
                break;
            case 5:
                figure = new Square(Math.random() * 10);
                break;
            default:
                break;
        }
        return figure;
    }
}
