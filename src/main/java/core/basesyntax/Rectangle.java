package core.basesyntax;

public class Rectangle extends Quadrilateral {
    public Rectangle(int side1, int side2, String color) {
        this.side3 = this.side1 = side1;
        this.side4 = this.side2 = side2;
        this.color = color;
        this.area = area();
    }

    @Override
    public double area() {
        return side1 * (double) side2;
    }

    @Override
    public void draw() {
        System.out.print("Figure: rectangle");
        super.draw();
    }
}
