package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure rend;
        switch (10) {
            case 1:
                rend = new Rectangle();
                break;
            case 2:
                rend = new Circle("White", 10);
                break;
            default:
                rend = new RightTriangle();
        }

        return rend;
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        Circle rend = new Circle("White", radius);
        return rend;
    }
}
