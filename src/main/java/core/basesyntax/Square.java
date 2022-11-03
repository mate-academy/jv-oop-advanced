package core.basesyntax;

public class Square extends Figure {
    private double area;
    private int side;

    public Square() {
        super();
    }

    public Square(String color, Double area, int side) {
        super(color);
        this.area = area;
        this.side = side;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        setArea((double)(side * side));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: square, area: ");
        builder.append(area);
        builder.append(" sq.units, side: ");
        builder.append(side);
        builder.append(" units, color: ");
        builder.append(super.getColor().toLowerCase());
        System.out.println(builder);
    }
}
