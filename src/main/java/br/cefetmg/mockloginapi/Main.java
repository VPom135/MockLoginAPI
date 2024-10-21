package br.cefetmg.mockloginapi;

import br.cefetmg.mockloginapi.dto.UsuarioDTO;
import br.cefetmg.mockloginapi.service.UserValidation;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        while(true) {

            Scanner scan = new Scanner(System.in);

            String login, password;

            System.out.println("Insira o Nome de Usuário:");
            login = scan.nextLine();

            System.out.println("Insira a Senha:");
            password = scan.nextLine();

            try {
                UsuarioDTO user = UserValidation.validateLogin(login, password);
                System.out.println("Login concluído! Bem vindo " + user.getNome() + " seu CPF é: " + user.getCpf());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Sistema finalizado.");
        
    }
    
}
