package core.basesyntax;

public class Square extends Quadrilateral {

    public Square() {
        this.side1 = random.nextInt(VALUE_LIMIT);
        this.side2 = side1;
        this.side3 = side1;
        this.side4 = side1;
        this.color = colorSupplier.getRandomColor();
        area();
    }

    public Square(int side1, String color) {
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;
        this.side4 = side1;
        this.color = color;
        area();
    }

    @Override
    public void draw() {
        System.out.print("Figure: square ");
        super.draw();
    }

    @Override
    public void area() {
        this.area = Math.pow(side1, 2);
    }
}
