package q5;

import javax.swing.JOptionPane;

public class Q5 {

    public static int impares(int n) {
        
        if (n==0)
            return 0;
        
        return n + impares(n-2);
        
    }
    
    public static void main(String[] args){
    
    int n1=6;
            
        JOptionPane.showMessageDialog(null,"Soma dos três primeiros números pares: " + Q5.impares(n1));
    
    
    }
    
}
