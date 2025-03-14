package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private int shorterSide;
    private int longerSide;
    private final static String NAME = "Rectangle";

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
        System.out.println("Figure: " + NAME + ", area: " + printArea() + " sq. units, shorter site: " + shorterSide + " units, longer site: " + longerSide + " units, color: " + getColor());
    }
}
