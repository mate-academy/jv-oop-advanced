package core.basesyntax;

public class RightTriangle extends Figure {
    private double side1;
    private double side2;
    private double hypotenuse;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setRightTriangle(double side1, double side2, double hypotenuse) {
        if ((hypotenuse > side1) && (hypotenuse > side2)
                && (hypotenuse * hypotenuse == side1 * side1 + side2 * side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.hypotenuse = hypotenuse;
        }
    }

    @Override
    public void calculateArea() {
        setArea((side1 + side2) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is RightTriangle, my area: " + getArea()
                + " my sides: " + side1 + " " + side2 + " "
                + hypotenuse + " my color: " + getColor());
    }
}
