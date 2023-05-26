/**
 * autores:
 * Juan Jose Goyes Zamnbrano
 * Josue Jessid Cardona Cabrera
 * Esneyder Ibarra
 * Juan Angeel Achicanoy
 * Esteban Riascos
 * Nicolas Benavides
 * 
 * 
 */
package tetris;

import javax.swing.JFrame;
/**
 *  Interfaz del juego tetris
 * 
 */
public class Ventana {
    public static final int WIDTH = 445, HEIGHT = 629;

    private Interfaz board;
    private Titulo titulo;
    private JFrame ventana;

    public Ventana() {

        ventana = new JFrame("Tetris");
        ventana.setSize(WIDTH, HEIGHT);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        board = new Interfaz();
        titulo = new Titulo(this);

        ventana.addKeyListener(board);
        ventana.addKeyListener(titulo);

        ventana.add(titulo);

        ventana.setVisible(true);
    }
    //metodo para la iniciacion de juego 
    public void startTetris() {
        ventana.remove(titulo);
        ventana.addMouseMotionListener(board);
        ventana.addMouseListener(board);
        ventana.add(board);
        board.startGame();
        ventana.revalidate();
    }
    // metodo Main donde se ejecuta el juego 
    public static void main(String[] args) {
        new Ventana();
    }

}
