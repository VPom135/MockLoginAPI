package br.cefetmg.mockloginapi.exceptions;

public class IncorrectPasswordException extends InvalidLoginException {
    public IncorrectPasswordException() {
        super("Senha inválida.");
    }
}