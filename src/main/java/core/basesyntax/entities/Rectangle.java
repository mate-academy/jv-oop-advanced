package core.basesyntax.entities;

public class Rectangle extends Figure {
    private static final Integer COEFFICIENT_TWO = 2;
    private Integer base;
    private Integer side;

    public Rectangle() {
    }

    public Rectangle(Color color, Integer base, Integer side) {
        super(color);
        this.base = base;
        this.side = side;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return base * side;
    }

    @Override
    public double getPerimeter() {
        return COEFFICIENT_TWO * (base + side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", base: " + base
                + ", side: " + side
                + ", color: " + getColor());
    }

    @Override
    public Figure clone() {
        return new Rectangle(getColor(), base, side);
    }
}
