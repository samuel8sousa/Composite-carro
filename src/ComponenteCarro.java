public abstract class ComponenteCarro {

    protected String nome;


    public ComponenteCarro(String nome){
        this.nome = nome;
    }


    public String getNome(){
        return nome;
    }


    public abstract double calcularPeso();

}