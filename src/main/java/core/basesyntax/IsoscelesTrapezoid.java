package core.basesyntax;

public  class IsoscelesTrapezoid extends Figure implements Area, Draw {
    private int shorterSide;
    private int longerSide;
    private int height;
    private final static String NAME = "Isosceles Trapezoid";

    public IsoscelesTrapezoid(int shorterSide, int longerSide, int height, String color) {
        super(color);
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
        this.height = height;
    }

    @Override
    public double printArea() {
        return ((shorterSide + longerSide) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + printArea() + " sq. units, shorter site: " + shorterSide + " units, longer site: " + longerSide + " units, height: " + height + " units, color: " + getColor());
    }
}
