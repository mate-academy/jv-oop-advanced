package core.basesyntax;

public abstract class Figure implements drawable{
    private Color color;
    private double area;

    @Override
    public void draw() {
        System.out.println("Figure area : " + area);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
