package model;

public class ColorSupplier {
    public static String getRandomColor() {
        String[] colors = new String[]{"acid green", "ash gray", "white", "black", "green", "yellow", "blue",
                "brown", "orange", "pink", "gray", "violet", "beige", "scarlet", "bitter lemon", "cadmium red",
                "silver", "gold", "turquoise", "emerald", "plum", "fuchsia", "indigo", "capri", "olive", "rose",
                "tangerine", "sage", "light blue", "hot pink", "peach", "seafoam", "lilac", "vanilla", "lemon"};
        int n = (int)Math.floor(Math.random() * colors.length);
        return colors[n];
    }
}
