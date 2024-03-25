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

    void mostraPC(){
        int cont = 0;
        for(Computador computador : computadores){
            if(computador != null){
                cont++;
                switch(computador.marca){
                    case "Positivo" -> System.out.println("Computador da promoção 1");
                    case "Acer" -> System.out.println("Computador da promoção 2");
                    case "Vaio" ->System.out.println("Computador da promoção 3");
                }
            }
        }
        if(cont == 0){
            System.out.println("Nenhum pc comprado");
        }
    }

    void mostraPCFinal(){
        for(Computador computador : computadores){
            if(computador != null){
                computador.mostraPCConfigs();
            }
        }
    }
}
