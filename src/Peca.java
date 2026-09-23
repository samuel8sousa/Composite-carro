public class Peca extends ComponenteCarro {


    private double peso;


    public Peca(String nome, double peso){

        super(nome);
        this.peso = peso;

    }


    @Override
    public double calcularPeso(){

        System.out.println(
                "Somando agora o peso de "
                        + nome
                        + ": "
                        + peso
        );

        return peso;

    }

}