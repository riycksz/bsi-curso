package q1;

import javax.swing.JOptionPane;

public class Q1 {

    public static void main(String[] args) {
        
        int n[] = new int [31];
        int cont=1,quadrado;
        
        String mostrar ="";
        
        n[0]=0;
        n[1]=1;
        
        for(int i=2; i<31; i++){
            
            cont++;
            quadrado = cont*cont;
            n[i]=quadrado;
            mostrar +=n[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, n[0] +" "+ n[1] + mostrar);
    }
    
}