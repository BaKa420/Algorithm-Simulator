package main.java;
public class Position {
    
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Position other = (Position) obj;

        return (other.getX() == this.getX() && other.getY() == this.getY());
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public int hashCode() {
        return (this.x * 10) + this.y ;
    }
}
