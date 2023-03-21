package core.basesyntax;

public class Figure implements Drawing, AreaFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        String message = "Figure";
        System.out.println(message);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
