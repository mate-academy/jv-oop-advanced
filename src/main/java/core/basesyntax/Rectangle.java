package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Painter {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        name = "rectangle";
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }


    @Override
    public void getArea() {
        area = firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + area + " sq. units, " + "firstSide: " + firstSide + " units, " + "secondSide: " + secondSide + " units, " + "color: " + color);
    }
}
