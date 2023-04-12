package core.basesyntax;

public class IsoscelesTrapezoid implements Figure{
    private double sideA;
    private double sideB;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }


    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    public void draw() {
        System.out.println(getArea());
    }

    @Override
    public String getColor() {
        return null;
    }
}
