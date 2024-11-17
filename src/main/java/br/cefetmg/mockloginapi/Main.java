package br.cefetmg.mockloginapi;

import br.cefetmg.mockloginapi.service.*;
import br.cefetmg.mockloginapi.dto.*;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while(run) {

            System.out.println("Selecione o teste a ser feito:");
            System.out.println("1 - Ajuda");
            System.out.println("2 - Login");
            System.out.println("3 - Pedir informação de departamento");
            System.out.println("4 - Sair");

            run = chooseTest(scan);

        }
        
    }

    private static boolean chooseTest(Scanner scan) {

        String input = scan.nextLine();
        input = input.toLowerCase();

        switch (input) {
            case "ajuda", "1" -> printHelp();
            case "login", "2" -> loginTest(scan);
            case "pedir informação de departamento", "departamento", "3" -> departamentAccessTest(scan);
            case "sair", "4" -> {
                return false;
            }
            default -> System.out.println(("Input invalido"));
        };

        return true;

    }

    private static void printHelp() {

        System.out.println("Selecione o teste a ser feito:");
        System.out.println("1 - Ajuda: exibe informações mais detalhadas dos casos de teste.");
        System.out.println("2 - Login: informe um login(cpf) e senha para simular um acesso ao sistema.");
        System.out.println("3 - Pedir informação de departamento: informe uma identificação de um departamento e " +
                "retorne suas informações.");
        System.out.println("4 - Pedir informação de Campus: informe uma identificação de um departamento e " +
                "retorne suas informações.");

    }

    private static void loginTest(Scanner scan) {

        boolean loginEnded = false;

        while(!loginEnded) {

            String login, password;

            System.out.println("Login:");
            login = scan.nextLine();

            System.out.println("Senha:");
            password = scan.nextLine();

            try {
                UsuarioDTO user = UsuarioValidation.validateLogin(login, password, false);
                System.out.println("Login concluído! Bem vindo " + user.getNome() + " seu CPF é: " + user.getCpf());
                loginEnded = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Sistema finalizado.");

    }

    private static int chooseAccessMethod(Scanner scan) {

        int accessMethod = switch (scan.nextLine()) {

            case "1", "nome" -> 1;
            case "2", "id" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            default -> 0;

        };

        return accessMethod;

    }

    private static void departamentAccessTest(Scanner scan) {

        boolean accessTryEnded = false;

        while(!accessTryEnded) {

            System.out.println("Escolha qual informação usar para procurar no banco de dados:");
            System.out.println("1 - nome do departamento.");
            System.out.println("2 - id do departamento.");
            System.out.println("3 - nome de um funcionário do departamento.");
            System.out.println("4 - id de um funcionário do departamento.");

            int accessMethod = chooseAccessMethod(scan);

            if (accessMethod == 0) {
                continue;
            }

            String s;
            int i;

            DepartamentoDTO dDTO = null;

            switch (accessMethod) {

                case 1:
                    s = scan.nextLine();
                    dDTO = DepartamentoInfo.getDTO(s);
                    break;

                case 2:
                    i = Integer.parseInt(scan.nextLine());
                    dDTO = DepartamentoInfo.getDTO(i);
                    break;

                case 3:
                    s = scan.nextLine();
                    dDTO = UsuarioValidation.getDepartamentoDTO(s);
                    break;

                case 4:
                    i = Integer.parseInt(scan.nextLine());
                    dDTO = UsuarioValidation.getDepartamentoDTO(i);
                    break;

                default:
                    System.out.println("Input invalido.");
                    break;

            }

            if (dDTO!=null) {

                System.out.println(dDTO.getNome() + " encontrado! Ele está localizado no Campus "
                                 + dDTO.getCampus() + ".");
                accessTryEnded = true;

            }

        }

    }

}
