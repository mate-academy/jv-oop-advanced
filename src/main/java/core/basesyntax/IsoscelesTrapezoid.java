package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int heigth;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int heigth) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.heigth = heigth;
    }

    @Override
    public void draw() {
        System.out.println("The " + getColor() + " isosceles trapez has a sideA of "
                + sideA + ", a sideB of " + sideB + ", a heigth of "
                + heigth + " and an area of " + getArea());
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * heigth * 2;
    }
}
