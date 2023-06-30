package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(String color, int side) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: square, area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }

    @Override
    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int side = figureSupplier.getRandomSideLength();
        return new Square(color, side);
    }
}
