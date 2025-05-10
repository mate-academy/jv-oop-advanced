package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topSide;
    private int bottomSide;

    public IsoscelesTrapezoid(String name, String color, int height, int topSide, int bottomSide) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public int area() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", color: " + color
                + ", area: " + area() + " sq.units"
                + ", height: " + height
                + ", top side: " + topSide
                + ", bottom side: " + bottomSide
                + ";"
        );
    }
}
