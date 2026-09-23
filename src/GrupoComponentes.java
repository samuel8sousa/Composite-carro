import java.util.ArrayList;
import java.util.List;


public class GrupoComponentes extends ComponenteCarro {


    private List<ComponenteCarro> componentes;


    public GrupoComponentes(String nome){

        super(nome);
        componentes = new ArrayList<>();

    }


    public void adicionar(ComponenteCarro componente){

        componentes.add(componente);

    }


    @Override
    public double calcularPeso(){

        double total = 0;


        for(ComponenteCarro componente : componentes){

            total += componente.calcularPeso();

        }


        System.out.println(
                "Somando agora o peso de "
                        + nome
                        + ": "
                        + total
        );


        return total;

    }

}