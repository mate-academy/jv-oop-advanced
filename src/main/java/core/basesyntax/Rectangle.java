package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Rectangle(Color color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
       return (side1 + side2 + side3) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Rectangle, my area: " + calculateArea()
                + " my side: " + side1 + " " + side2 + " " + side3 + " my color: " + getColor());
    }
}
