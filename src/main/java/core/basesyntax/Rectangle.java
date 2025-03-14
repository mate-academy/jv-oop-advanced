package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double printArea() {
        double area = (double) firstSide * secondSide;
        return area;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: rectangle area: " + printArea();
        String secondPart = " sq. units, shorter site: " + firstSide + " units, longer site: ";
        String thirdPart = secondSide + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart);
    }
}
