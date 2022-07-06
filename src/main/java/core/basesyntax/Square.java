package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        super.drawInfo();
        System.out.print("square" + ", area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, side: " + side + " units, color: " + getColor());
    }
}
