package project;
import java.util.Objects;

public class Vector2d {
    public int x;
    public int y;

    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public boolean precedes(Vector2d that) {
        return this.x <= that.x && this.y <= that.y ;
    }

    public boolean follows(Vector2d that) {
        return this.x >= that.x && this.y >= that.y;
    }

    public Vector2d add(Vector2d other) {
        return new Vector2d(this.x + other.x, this.y + other.y);
    }

    public Vector2d subtract(Vector2d other) {
        return new Vector2d(this.x - other.x, this.y - other.y);
    }

    @Override
    public boolean equals(Object that){
        if (this == that)
            return true;
        if (!(that instanceof Vector2d))
            return false;
        Vector2d other = (Vector2d) that;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

}
