
/**
 * Curso Java Alfamidia.
 * implemetação da classe tela utilizada em outro exemplo
 * 
 * @author (Ricardo Corcini) 
 * @version (v 1.0)
 */

import javax.swing.*;

public class Tela

{
    public static int retornaInt(String txt){
        //usa o metodo do java para abir janela de dialogo sempre retorna String
        String snum = JOptionPane.showInputDialog(txt);
        
        //vonverte a string em numero
        int inum = Integer.parseInt(snum);
        
        //retorna para quem usar esse metodo
        return inum;
        
    }
    public static void mostraTXT(String txt){
        //mostra janela dialogo o texto informado
        JOptionPane.showMessageDialog(null, txt);
    }
    
    public static String retornaTxt(String txt){
        String sval = JOptionPane.showInputDialog(txt);
        return sval;
    }
    
    
    /* public static int retornaInt(String txt){
        String sval = retornaTxt(txt);
        int ival = Integer.parseInt(sval);
        return ival;
    }
    */
    public static double retornaDbl(String txt){
        String sval = retornaTxt(txt);
        double dval = Double.parseDouble(sval);
        return dval;
        
    }
    
    public static void mostraTxt(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
    
    
    
}
