package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Shape:\t" + FigureName.SQUARE.name()
                + ",\tColor:\t" + this.getColor()
                + ",\tArea:\t" + this.getArea()
                + ",\tSide:\t" + this.getSide());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
