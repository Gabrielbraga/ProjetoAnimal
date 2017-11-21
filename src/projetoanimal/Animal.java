
package projetoanimal;


public class Animal {
    private String nome;
    private String raça;

    public Animal(String nome, String raça) {
        this.nome = nome;
        this.raça = raça;
    }
    
    public void caminhar(){
        System.out.println(nome + " Está caminhando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    
}
