public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void addComputador(Computador computador){
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] == null){
                computadores[i] = computador;
                break;
            }
        }
    }
    float calculaTotalCompra(){
        float precoTotal = 0;
        for(Computador computador : computadores){
            if(computador != null){
                precoTotal += (computador.preco);
            }
        }
        return precoTotal;
    }

    void showPC(){
        for(Computador computador : computadores){
            if(computador != null){
                System.out.println("Computador");
            }
        }
    }
}
