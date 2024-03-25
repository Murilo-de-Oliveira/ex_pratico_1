import java.util.Arrays;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistema;
    //HardwareBasico hardware;
    HardwareBasico[] hardwares = new HardwareBasico[3];
    MemoriaUSB memoriaUSB;
    public Computador(String marca, float preco,String nomeSO, int tipo, String nomeHw1, float capacidade1, String nomeHw2, float capacidade2, String nomeHw3, float capacidade3) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = new SistemaOperacional(nomeSO, tipo);
        this.hardwares[0] = new HardwareBasico(nomeHw1, capacidade1);
        this.hardwares[1] = new HardwareBasico(nomeHw2, capacidade2);
        this.hardwares[2] = new HardwareBasico(nomeHw3, capacidade3);
    }

    void mostraPCConfigs(){
        for (String s : Arrays.asList("---Computador---", "Marca: " + this.marca, "Preço: " + this.preco, "---Sistema Operacional---", "Nome: " + this.sistema.nome, "Tipo: " + this.sistema.tipo)){
            System.out.println(s);
        }
        System.out.println( "---Hardware---");
        for(HardwareBasico hardware : hardwares){
            System.out.println("Nome: " + hardware.nome);
            System.out.println("Capacidade: " + hardware.capacidade);
        }
    }

    void addMemoriaUSB(String nome, int capacidade){
        this.memoriaUSB = new MemoriaUSB(nome,capacidade);
    }
}
