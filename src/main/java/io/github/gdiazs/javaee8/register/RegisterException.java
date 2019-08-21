package io.github.gdiazs.javaee8.register;

import javax.persistence.PersistenceException;

public class RegisterException extends RuntimeException {
    public RegisterException(String s, PersistenceException pe) {
    }
}
