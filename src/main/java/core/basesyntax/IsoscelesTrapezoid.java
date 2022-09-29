package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureOperations {
    private int side;
    private int highGround;
    private int lowGround;

    public IsoscelesTrapezoid(int side, int highGround, int lowGround) {
        this.side = side;
        this.highGround = highGround;
        this.lowGround = lowGround;
        this.setType("isosceles trapezoid");
    }

    public double getArea() {
        int perimeter = side + side + highGround + lowGround;
        return Math.sqrt((perimeter / 2 - lowGround) * (perimeter / 2 - highGround)
                * (perimeter / 2 - side) * (perimeter / 2 - side));
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " units, side: " + side
                + " units, highGround: " + highGround + " units, lowGround: " + lowGround
                + " units, color: " + getColor());
    }
}
