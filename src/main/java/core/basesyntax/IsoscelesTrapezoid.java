package core.basesyntax;

public class IsoscelesTrapezoid extends Quadrilateral {

    public IsoscelesTrapezoid(int side1, int side2, int side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = this.side4 = side3;
        this.color = color;
        this.area = area();
    }

    @Override
    public double area() {
        return (side1 + side2) * Math.sqrt((Math.pow(side3, 2)
                - Math.pow(side1 - side2, 2) / 4));
    }

    @Override
    public void draw() {
        System.out.print("Figure: trapezoid");
        super.draw();
    }
}
