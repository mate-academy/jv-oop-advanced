package core.basesyntax;

public class Rectangle extends Quadrilateral {

    public Rectangle() {
        this.side1 = random.nextInt(VALUE_LIMIT);
        this.side2 = random.nextInt(VALUE_LIMIT);
        this.side3 = side1;
        this.side4 = side2;
        this.color = colorSupplier.getRandomColor();
        area();
    }

    public Rectangle(int side1, int side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side1;
        this.side4 = side2;
        this.color = color;
        area();
    }

    @Override
    public void area() {
        this.area = side1 * (double) side2;
    }

    @Override
    public void draw() {
        System.out.print("Figure: rectangle ");
        super.draw();
    }
}
