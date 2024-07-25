package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double squareArea = side * side;
        return getFormat("#.##",squareArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + FigureName.SQUARE.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, color: " + getColor().toLowerCase());
    }
}
