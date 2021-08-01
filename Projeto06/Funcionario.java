
/**
 * Escreva uma descrição da classe Funcionario aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Funcionario
{
    //constante (final( que pode ser acessada dentro da estrutura hierarquica(Protected)
    
    protected final double TAX = 0.10;
    
    //outros atributos com acesso local
    private String nom;
    private String ema;

    /**
     * Construtor para objetos da classe Funcionario
     */
    public Funcionario(String nom, String ema)
    {
        this.nom = nom;
        this.ema = ema;
    }
    public void setNome(String nom){
        this.nom = nom;
    }
    
    public String getNome(){
        return this.nom;
    }
    
   
    //metodo modelo para ser usado nas subclasses
    // public abstract double calcularSalario() ; clase abstrata
    
     // metodo com o calculo basico do salaorio
    public double calcularSalario(){
        //
        return 0;
    }
}
