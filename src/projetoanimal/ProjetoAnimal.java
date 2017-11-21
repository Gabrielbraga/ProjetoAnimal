
package projetoanimal;

import java.util.ArrayList;


public class ProjetoAnimal {

    
    public static void main(String[] args) {
        
        ArrayList<Animal> animais = new ArrayList<>();
        
        animais.add(new Cachorro("perdita", "beagle"));
        animais.add(new Cachorro("pingo", "dalmata"));
        animais.add(new Cachorro("max", "labrador"));
        
        animais.add(new Gato("tom", "siames"));
        animais.add(new Gato("frodo", "perca"));
        animais.add(new Gato("sassy", "himalaia"));
        
        // foreach iterar pelos animais
        // para cada animal chamar caminhar
        
        for(Animal animal : animais){
            animal.caminhar();
            
        }
        
    }
    
}
