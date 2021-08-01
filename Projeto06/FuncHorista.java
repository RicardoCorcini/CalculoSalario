
/**
 * Escreva uma descrição da classe FuncHorista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FuncHorista extends Funcionario
{
    
    private int qtd; 
    private double val;
    
    public FuncHorista(String nom, String ema, int qtd, double val)
    {
        //chama construtor da classe pai, super classe
        super(nom, ema);
        
        //inicialização de outras variaveis da classe
        this.qtd = qtd;
        this.val = val;
        //outros metodos da classe pai
        //super.setNome("dfhlksjadfhlsdak");
    }
    
    //metodo para realizar o calculo do saralrio
    // usa constante TAX
    public double calcularSalario(){
        double bas = this.qtd * this.val;
        double sal = bas - (bas * this.TAX);
        
        return sal;
    }
    
}
