package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int hight;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int hight) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hight = hight;
    }

    @Override
    public int getArea() {
        return (firstLeg + secondLeg) * hight / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                           + getArea()
                           + " sq.units, firstLeg: "
                           + firstLeg
                           + " units, secondLeg: "
                           + secondLeg
                           + " units, hight: "
                           + hight
                           + " units, color: "
                           + getColor());
    }
}
