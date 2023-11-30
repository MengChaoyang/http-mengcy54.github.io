package TANK.ex.ex1;

public class Player {
        private Board board;

        public Player(Board board) {
            this.board = board;
        }

        public void keyPressed(char key) {
            switch (key) {
                case 'w':
                    // 向上移动坦克
                    break;
                case 'a':
                    // 向左移动坦克
                    break;
                case 's':
                    // 向下移动坦克
                    break;
                case 'd':
                    // 向右移动坦克
                    break;
                case 't':
                    // 射击
                    break;
                default:
                    break;
            }
        }
    }

