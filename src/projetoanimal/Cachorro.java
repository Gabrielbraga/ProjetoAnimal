
 
package projetoanimal;


public class Cachorro extends Animal{

    
    
    public Cachorro(String nome, String raça) {
        super(nome, raça);
    }
    
    public void late(){
        System.out.println(getNome() + "Esta latindo");
    }
}
