package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private int shorterSide;
    private int longerSide;

    public Rectangle(int shorterSide, int longerSide, String color) {
        super(color);
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
    }

    @Override
    public double printArea() {
        double area = (double) shorterSide * longerSide;
        return area;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: rectangle area: " + printArea();
        String secondPart = " sq. units, shorter site: " + shorterSide + " units, longer site: ";
        String thirdPart = longerSide + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart);
    }
}
