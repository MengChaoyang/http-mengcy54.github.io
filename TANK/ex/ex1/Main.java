package TANK.ex.ex1;

    public class Main {
        public static void main(String[] args) {
            Board board = new Board(100, 100);
            Player player = new Player(board);

            // 放置坦克
            Tank tank1 = new Tank(10, 10, 30, 30, "right");
            board.placeTank(tank1, 0, 0);

            Tank tank2 = new Tank(90, 90, 30, 30, "left");
        }
    }
