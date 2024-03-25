import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador(
                "Positivo",
                3300,
                "Linux Ubuntu",
                32,
                "Pentium Core i3",
                2200,
                "Memória RAM",
                8,
                "HD",
                500
        );
        Computador computador2 = new Computador(
                "Acer",
                8800,
                "Windows 8",
                64,
                "Pentium Core i5",
                3370,
                "Memória RAM",
                16,
                "HD",
                1000
        );
        Computador computador3 = new Computador(
                "Vaio",
                4800,
                "Windows 10",
                64,
                "Pentium Core i7",
                4500,
                "Memória RAM",
                32,
                "HD",
                2000
        );
        computador1.addMemoriaUSB("Pen-drive",16);
        computador1.addMemoriaUSB("Pen-drive",32);
        computador1.addMemoriaUSB("HD Externo",1000);
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o nome e o cpf do cliente: ");
        Cliente cliente = new Cliente(
                input.nextLine(),
                input.nextLong()
        );
        input.nextLine();
        boolean flag = true;
        while(flag){
            System.out.println("Olá, bem vindo a promoção da PCMania!");
            System.out.println("1 - Comprar um pc");
            System.out.println("2 - Ver pc's disponíveis");
            System.out.println("3 - Lista de pc's adquiridos");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int option = input.nextInt();
            switch (option){
                case 1 -> {
                    System.out.print("Digite a pomoção que deseja: ");
                    option = input.nextInt();
                    if(option < 0 || option > 3){
                        System.out.println("Inválido");
                    }
                    else{
                       switch (option){
                           case 1 -> cliente.addComputador(computador1);
                           case 2 -> cliente.addComputador(computador2);
                           case 3 -> cliente.addComputador(computador3);
                       }
                    }
                }
                case 2 -> {
                    computador1.mostraPCConfigs();
                    computador2.mostraPCConfigs();
                    computador3.mostraPCConfigs();
                }
                case 3 -> cliente.mostraPC();
                case 4 -> {
                    flag = false;
                    System.out.println("Nome do cliente: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println("Valor da compra: " + cliente.calculaTotalCompra());
                    cliente.mostraPCFinal();
                }
                default -> System.out.println("Inválido");
            }
        }
    }
}