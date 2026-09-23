public class Main {

    public static void main(String[] args){


        Carro carro = new Carro();


        Carroceria carroceria = new Carroceria();

        carroceria.adicionar(
                new Peca("Porta",20)
        );

        carroceria.adicionar(
                new Peca("Capô",15)
        );


        Chassi chassi = new Chassi();


        TremDeForca motor =
                new TremDeForca();


        motor.adicionar(
                new Peca("Motor",150)
        );


        chassi.adicionar(motor);


        carro.adicionar(carroceria);
        carro.adicionar(chassi);


        double peso = carro.calcularPeso();


        System.out.println(
                "Peso total: " + peso
        );

    }

}