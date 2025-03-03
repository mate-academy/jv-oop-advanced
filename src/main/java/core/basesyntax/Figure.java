package core.basesyntax;

class Figure implements Drawing {
    private Colors color;

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
