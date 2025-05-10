package core.basesyntax.entities;

public class IsoscelesTrapezoid extends Figure {
    private static final Integer COEFFICIENT_TWO = 2;
    private Double angle;
    private Integer upperBase;
    private Integer lowerBase;
    private Integer side;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(Color color, Double angle, Integer upperBase, Integer lowerBase,
                              Integer side) {
        super(color);
        this.angle = angle;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.side = side;
    }

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public Integer getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(Integer upperBase) {
        this.upperBase = upperBase;
    }

    public Integer getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(Integer lowerBase) {
        this.lowerBase = lowerBase;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * Math.sin(angle) * (lowerBase - side * Math.cos(angle));
    }

    @Override
    public double getPerimeter() {
        return COEFFICIENT_TWO * side + upperBase + lowerBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", angle: " + angle
                + ", upper base: " + upperBase
                + ", lower base: " + lowerBase
                + ", side: " + side
                + ", color: " + getColor());
    }

    @Override
    public Figure clone() {
        return new IsoscelesTrapezoid(getColor(), angle, upperBase, lowerBase, side);
    }
}
