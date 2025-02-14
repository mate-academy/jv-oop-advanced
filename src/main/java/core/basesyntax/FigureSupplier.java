package core.basesyntax;

class FigureSupplier {
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = (int) (Math.random() * 5);
        switch (figureType) {
            case 0:
                return new Square(color, Math.random() * 10 + 1);
            case 1:
                return new Rectangle(color, Math.random() * 10 + 1, Math.random() * 10 + 1);
            case 2:
                return new RightTriangle(color, Math.random() * 10 + 1, Math.random() * 10 + 1);
            case 3:
                return new Circle(color, Math.random() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color, Math.random() * 10 + 1, Math.random() * 10 + 1, Math.random() * 10 + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
