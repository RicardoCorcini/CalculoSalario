
/**
 * Escreva uma descrição da classe FuncIntegral aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FuncIntegral  extends Funcionario
{
   
    private double bas;
    public FuncIntegral(String nom, String ema, double bas)
    {
        //chama construtor ca classe pai, super classe
        super(nom, ema);
        
        this.bas = bas;
               
    }
    
    
    //realiza calculo de salarios usando constante
     public double calcularSalario(){
         double sal = this.bas - this.bas * this.TAX;
         return sal;
    }

}
