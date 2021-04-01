package core.basesyntax;

public class RightRectangle extends Figure{
    double side1;
    double side2;
    double hypotenuse;

    public RightRectangle(double side1, double side2, double hypotenuse) {
        if ((hypotenuse > side1) && (hypotenuse > side2)
                && (hypotenuse * hypotenuse == side1 * side1 + side2 * side2))
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void calculateArea() {
        this.area = (side1 + side2) / 2;
    }

    @Override
    public void draw() {

    }
}
