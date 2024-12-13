package br.cefetmg.mockloginapi.exceptions;

public class InvalidLoginCredentialsException extends RuntimeException {
    public InvalidLoginCredentialsException() {
        super("Usuário e/ou senha inválidos");
    }
}