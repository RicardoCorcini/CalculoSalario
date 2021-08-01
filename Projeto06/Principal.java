
/**
 * Clase que inicializa o sistema
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{
    public static void main(String args[]){
        Funcionario func = null;
        
        String nom = Tela.retornaTxt("Nome");
        String ema = Tela.retornaTxt("E-mail");
        
        String tip = Tela.retornaTxt("H - Horista || I - Integral");
        if (tip.equals("H")){
            int qtd = Tela.retornaInt("Qtd de horas");
            double val = Tela.retornaDbl("Valor Hora");
            func = new FuncHorista(nom, ema, qtd, val);
        }
        
        if (tip.equals("I")){
            double sal = Tela.retornaDbl("Salárop Base");
            func = new FuncIntegral(nom, ema, sal);
        }
        
        // usar metodos de forma genérica
        double sal = func.calcularSalario();
        nom = func.getNome();
        Tela.mostraTxt(nom + " seu salario será: " + sal);
     }
}
