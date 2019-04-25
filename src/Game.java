import tetris.gui.Block;
import tetris.gui.GUI;

public class Game {
    private GUI gui;

    public Game(GUI gui) {
        this.gui = gui;
    }


    public void start() {
        Block block = new Block(5, 5, 3);
        gui.drawBlock(block);
        while(true) {

        }
    }
}
