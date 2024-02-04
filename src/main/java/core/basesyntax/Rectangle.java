package core.basesyntax;

public class Rectangle extends Figure {
    private String color;
    private int horizontalSide;
    private int verticalSide;

    public Rectangle(String color, int horizontalSide, int verticalSide) {
        this.color = color;
        this.horizontalSide = horizontalSide;
        this.verticalSide = verticalSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has " + color + "color."
                + "Sides lengh is " + horizontalSide + " and " + verticalSide
                + ". Area is " + getArea());
    }

    @Override
    public int getArea() {
        return horizontalSide * verticalSide;
    }
}
