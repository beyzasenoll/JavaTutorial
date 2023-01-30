import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Minesweeper implements MouseListener {
    btn[][] board = new btn[10][10];
    int mineCount = 10;
    JFrame jFrame;
    int openedButtonCounter = 0;
    private boolean gameOver=false;



    public Minesweeper() {
        jFrame = new JFrame("Minesweeper");
        jFrame.setSize(800, 800);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(10, 10));
        jFrame.setVisible(true);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                btn b = new btn(i, j);
                b.addMouseListener(this);
                board[i][j] = b;
                jFrame.add(b);
            }
        }
        putMine(board.length, board[0].length);

    }

    private void putMine(int rowCount, int columnCount) {
        for (int i = 0; i < mineCount; i++) {
            Random rnd = new Random();
            int locRow = rnd.nextInt(0, rowCount);
            int locCol = rnd.nextInt(0, columnCount);
            if (board[locRow][locCol].isMine()) {
                i--;
            } else {
                board[locRow][locCol].putMine();
            }
        }
    }

    private int Counter(btn b) {
        int rowCount =board.length;
        int columnCount =board[0].length;
        int mineCounter = 0;
        for (int i = b.getRow()-1; i <= b.getRow()+1; i++) {
            if(i<0 || i>=rowCount) {
                continue;
            }
            for (int j = b.getCol()-1; j <= b.getCol()+1; j++) {
                if(j<0 || j>=columnCount) {
                    continue;
                }
                if(board[i][j].isMine()) {
                    mineCounter++;
                }
            }
        }
        openedButtonCounter++;
        return mineCounter;
    }

    public void open(int row, int col) {

        if(row < 0 || row >= board.length || col<0 || col>=board[0].length) {
            return;
        }
        btn b = board[row][col];
        if(b.getText().length()>0 || !b.isEnabled()){
            return;
        }

        int mineCounter = Counter(b);
        b.setEnabled(false);
        if(b.isFlag()) {
            b.setIcon(null);
        }
        if(mineCounter!=0) {
            b.setText(String.valueOf(mineCounter));
        }
        if (mineCounter == 0) {
            open(row-1,col);
            open(row+1,col);
            open(row,col-1);
            open(row,col+1);
        }
    }

    public void openAll() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].isMine()) {
                    board[i][j].setIcon(new ImageIcon("mine.png"));
                } else {
                    open(i, j);
                }
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (!gameOver) {
            btn b = (btn) e.getComponent();
            if(e.getButton() == 1) {
                if(b.isMine()) {
                    JOptionPane.showMessageDialog(jFrame,"You hit the mine.","Game Over!", JOptionPane.ERROR_MESSAGE);
                    openAll();
                    gameOver=true;
                } else {
                    open(b.getRow(),b.getCol());
                    if(openedButtonCounter == (board.length * board[0].length)-mineCount) {
                        JOptionPane.showMessageDialog(jFrame,"You won!","Game Finished", JOptionPane.INFORMATION_MESSAGE);
                        openAll();
                        gameOver=true;
                    }
                }
            } else if (e.getButton() == 3) {
                if(!b.isFlag()) {
                    b.setIcon(new ImageIcon("flag.png"));
                    b.putFlag();
                } else {
                    b.setIcon(null);
                    b.removeFlag();
                }
            }
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}