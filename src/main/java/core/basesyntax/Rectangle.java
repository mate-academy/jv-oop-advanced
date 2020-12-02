package core.basesyntax;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;
    private String color;

    public Rectangle(double sideOne, double sideTwo, String color) {
        this.sideA = sideOne;
        this.sideB = sideTwo;
        this.color = color;
    }

    public void getSides() {
        System.out.println("Side one : " + sideA + ", side two : " + sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double uniqueMethod() {
        return ((sideA + sideB) * 2);
    }

    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' perimeter " + uniqueMethod() + " units , color: "
                + this.color.toLowerCase());
    }

}
