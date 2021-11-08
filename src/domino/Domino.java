package domino;

import javax.swing.JOptionPane;

public class Domino {

public static void main(String[] args) {
    
         int n = 4,  x = n + 1,  p = ( x * x + x ) / 2;
         
         JOptionPane.showMessageDialog(null, "O número de peças do jogo é:" + p);
    }    
}
