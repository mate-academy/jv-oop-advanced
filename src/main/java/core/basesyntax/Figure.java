package core.basesyntax;

abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("This is a " + color + " figure");
    }
}
