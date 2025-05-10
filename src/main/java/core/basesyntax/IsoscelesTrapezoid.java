package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side;
    private final int highGround;
    private final int lowGround;
    private String type;

    public IsoscelesTrapezoid(String color, int side, int highGround, int lowGround) {
        super(color);
        this.side = side;
        this.highGround = highGround;
        this.lowGround = lowGround;
        this.setType("isosceles trapezoid");
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getArea() {
        int perimeter = side + side + highGround + lowGround;
        return Math.sqrt((perimeter / 2 - lowGround) * (perimeter / 2 - highGround)
                * (perimeter / 2 - side) * (perimeter / 2 - side));
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + type + ", area: " + getArea() + " units, side: " + side
                + " units, highGround: " + highGround + " units, lowGround: " + lowGround
                + " units, color: " + getColor());
    }
}
