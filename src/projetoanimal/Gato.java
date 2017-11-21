
package projetoanimal;


public class Gato extends Animal {

   
    
    public Gato(String nome, String raça) {
        super(nome, raça);
    }

     
    
    public void miar(){
        System.out.println(getNome() + "Esta miando");
    
}
}