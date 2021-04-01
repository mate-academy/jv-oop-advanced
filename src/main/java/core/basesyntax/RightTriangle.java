package core.basesyntax;

public class RightTriangle extends Figure {
    private double side1;
    private double side2;
    private double hypotenuse;

    public RightTriangle(Color color, double side1, double side2, double hypotenuse) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double calculateArea() {
        return (side1 + side2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is RightTriangle, my area: " + calculateArea()
                + " my sides: " + side1 + " " + side2 + " "
                + hypotenuse + " my color: " + getColor());
    }
}
