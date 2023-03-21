package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int size, int i) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        String message = "Figure: Rectangle, area: " + getArea()
                + " SideA:" + sideA + " SideB" + sideB
                + " color:" + getColor();
        System.out.println(message);
    }
}

