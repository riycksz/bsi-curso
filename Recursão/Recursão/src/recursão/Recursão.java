package recursão;

import javax.swing.JOptionPane;

public class Recursão {


    public static int multR(int m, int n) {
        if (n > 0) {
            return m + Recursão.multR(m, n - 1);
        }
        return 0;
    }
    
    public static void main(String[] args){
    
    String multiplica1="",multiplica2="";
    int m1,n1;
    
    multiplica1 = JOptionPane.showInputDialog(null,"Valor de m1 ");
        m1 = Integer.parseInt(multiplica1);

        multiplica2 = JOptionPane.showInputDialog(null,"Valor de m2 ");
        n1 = Integer.parseInt(multiplica2);

        JOptionPane.showMessageDialog(null,"A multiplicação de " + m1 +"x"+n1 + " é " + Recursão.multR(m1,n1));
    
    
    }
    
}