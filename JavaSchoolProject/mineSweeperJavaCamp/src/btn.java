import javax.swing.*;

public class btn extends JButton {
    private int row;
    private int col;
    private boolean mine = false;
    private boolean flag = false;

    public btn (int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public boolean isMine() {
        return mine;
    }
    public boolean isFlag() {
        return flag;
    }
    public void putMine() {
        mine = true;
    }
    public void putFlag() {
        flag = true;
    }
    public void removeFlag() {
        flag = false;
    }
}