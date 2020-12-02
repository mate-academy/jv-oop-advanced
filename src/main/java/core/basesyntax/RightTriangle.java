package core.basesyntax;

public class RightTriangle extends Figures {
    private int side1;
    private int side2;
    private double hypotenuse;

    public void setParameters(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
        hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
    }

    public void setArea() {
        super.setArea(side1 * side2 / 2);
    }

    public void printInfo() {
        System.out.println("Shape: right triangle, area: " + getArea() + " sq. units, hypotenuse: "
                + hypotenuse + " units, color: " + getColor());
    }
}
