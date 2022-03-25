package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, Draw{
    private String color;
    private int side1;
    private int side2;
    private int hight;

    public IsoscelesTrapezoid(String color, int side1, int side2, int hight) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (hight/2) * (side1 + side2);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isosceles Trapezoid, area: " + getArea()
                + "sq.units, firs side: " + side1 + "second side: " + side2 + " units, " + hight + " units, color "
                + color);
    }

}
