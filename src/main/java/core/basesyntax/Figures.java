package core.basesyntax;

abstract class Figures implements Drawable {
    private Colors color;

    public Figures(Colors color) {
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public void draw() {
        System.out.println("Figure has been drawn");
    }
    abstract int getArea();
}
