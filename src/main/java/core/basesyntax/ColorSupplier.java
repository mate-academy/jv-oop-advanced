package core.basesyntax;

class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "green", "blue", "yellow", "black", "white"};
        return colors[(int) (Math.random() * colors.length)];
    }
}
