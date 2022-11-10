package core.basesyntax;

public class Rectangle extends Figure {
    private double area;
    private int side1;
    private int side2;

    public Rectangle() {
        super();
    }

    public Rectangle(String color, Double area, int side1, int side2) {
        super(color);
        this.area = area;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public void area() {
        setArea((double)(side1 * side2));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: rectangle, area: ");
        builder.append(area);
        builder.append(" sq.units, side1: ");
        builder.append(side1);
        builder.append(" units, side2: ");
        builder.append(side2);
        builder.append(" units, color: ");
        builder.append(super.getColor().toLowerCase());
        System.out.println(builder);
    }
}
