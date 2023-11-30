package TANK.ex.ex1;

public class Tank {
    public int x;
    public int y;
    private int width, height;
    private String direction;

    public Tank(int x, int y, int width, int height, String direction) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void turn(String newDirection) {
        direction = newDirection;
    }

    public void shoot() {
        // 射击逻辑
    }

    public boolean isColliding(Tank other) {
        return (other.x >= this.x && other.x <= this.x + width) &&
                (other.y >= this.y && other.y <= this.y + height);
    }
}

