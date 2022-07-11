package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int height;

    public Rectangle(String color, int side, int height) {
        super("rectangle", color);
        this.side = side;
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " square: " + getSquare() + " side: "
                + getSide() + " height: " + getHeight() + " color: " + getColor());
    }

    @Override
    double getSquare() {
        return 0.5 * getSide() * getHeight();
    }
}
