package core.basesyntax;

class Figure implements Drawing, AreaCalculator {
    private Colors color;

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Figure");
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
