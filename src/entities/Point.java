package entities;

public class Point {
    // Encaptulation
    private int x;
    private int y;

    // Constructeur sans args, pour la création de l'object Point avec les valeurs par défaut
    public Point() {
    }

    // Constructeur avec args, pour la création de l'object Point avec des valeurs précises
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // accesseurs

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
