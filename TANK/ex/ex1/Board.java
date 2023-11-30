package TANK.ex.ex1;
import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Board {
    private int width, height;
    private Tank[][] tanks;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        tanks = new Tank[width][height];
    }

public void placeTank(Tank tank, int x, int y) {
    tanks[x][y] = tank;
}

public void moveTank(Tank tank, int dx, int dy) {
    if (tanks[dx + tank.x][dy + tank.y] == null) {
        tanks[dx + tank.x][dy + tank.y] = tank;
        tank.move(dx, dy);
    }
}

public void turnTank(Tank tank, String newDirection) {
    if (tanks[tank.x][tank.y] != null) {
        tank.turn(newDirection);
    }
}

public void shootTank(Tank tank) {
    // 射击逻辑
}

public void clear() {
    for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            tanks[i][j] = null;
        }
    }
}

public boolean isColliding(Tank tank, Tank other) {
    return tanks[other.x][other.y] != null &&
            tanks[other.x][other.y].isColliding(tank);
}
}

