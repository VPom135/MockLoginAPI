package br.cefetmg.mockloginapi.exceptions;

public class UserNotFoundException extends InvalidLoginException {
    public UserNotFoundException() {
        super("Usuário não encontrado no sistema.");
    }
}