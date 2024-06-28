import java.util.ArrayList;

public class Nomes {
    private ArrayList<String> nomes;
    private ArrayList<String> nomes2;

    public Nomes() {
        nomes = new ArrayList<>();
        nomes2 = new ArrayList<>();
        adicionarNomes();   
        adicionarNomes2(); 
    }

    private void adicionarNomes() {
        nomes.add("Joao");
        nomes.add("Julis");
        
    }

    private void adicionarNomes2() {
        nomes2.add("Leandro");
        nomes2.add("Luana");
        
    }

    // Métodos para acessar 'nomes'
    public int sizeNomes(){
        return nomes.size();
    }

    public String getNomes(int index) {
       return nomes.get(index);
    }

    // Métodos para acessar 'nomes2'
    public int sizeNomes2(){
        return nomes2.size();
    }

    public String getNomes2(int index) {
       return nomes2.get(index);
    }
    // Métodos para remover nomes
    public void removeNome(int index) {
        nomes.remove(index);
    }

    public void removeNome2(int index) {
        nomes2.remove(index);
    }
}
