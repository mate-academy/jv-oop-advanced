package core.basesyntax;

public class Square extends Quadrilateral {

    public Square(int side1, String color) {
        this.side1 = this.side2 = this.side3 = this.side4 = side1;
        this.color = color;
        this.area = area();
    }

    @Override
    public double area() {
        return Math.pow(side1, 2);
    }

    @Override
    public void draw() {
        System.out.print("Figure: square");
        super.draw();
    }

}
