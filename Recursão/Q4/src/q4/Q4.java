package q4;

import javax.swing.JOptionPane;

public class Q4 {

    public static int impares(int n) {
        
        if (n==1)
            return 1;
        
        return n + impares(n-2);
        
    }
    
    public static void main(String[] args){
    
    int n1=5;
            
        JOptionPane.showMessageDialog(null,"Soma dos três primeiros números ímpares: " + Q4.impares(n1));
    
    
    }
    
}
