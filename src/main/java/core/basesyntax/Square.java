package core.basesyntax;

public class Square implements Behavior {
    private String color =  "color";
    private int storona;

    public Square(String color,  int storona) {
        this.color = color;
        this.storona = storona;
    }

    public int getArea() {
        return storona * storona;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + storona + " units, color: " + color);
    }
}
