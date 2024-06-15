package principal;

import java.util.ArrayList;

public class Controlador {

    private ArrayList<Animal> listaAnimais;

    public Controlador() {
        this.listaAnimais = new ArrayList();
    }

    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public void setListaAnimais(ArrayList<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }

    public boolean salvar(Animal animal) {
        if (animal != null) {
            this.listaAnimais.add(animal);
            return true;
        } else {
            return false;
        }
    }

    public void alterar(int id, Animal p) {
        this.listaAnimais.get(id).setCAF(p.getCAF());
        this.listaAnimais.get(id).setTipo(p.getTipo());
        this.listaAnimais.get(id).setNome(p.getNome());
        this.listaAnimais.get(id).setPeso(p.getPeso());

    }
    
    public boolean deletar(int id) {
        this.listaAnimais.remove(id);
        return true; 
    }
    
    

}
