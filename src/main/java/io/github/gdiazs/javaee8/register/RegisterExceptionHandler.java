package io.github.gdiazs.javaee8.register;

import net.bootsfaces.utils.FacesMessages;
import org.apache.deltaspike.core.api.exception.control.ExceptionHandler;
import org.apache.deltaspike.core.api.exception.control.Handles;
import org.apache.deltaspike.core.api.exception.control.event.ExceptionEvent;


import javax.persistence.PersistenceException;

@ExceptionHandler
public class RegisterExceptionHandler {



    public void onRegisterException(@Handles ExceptionEvent<RegisterException> exceptionEvent){
        System.out.println("Exception handled here: " + this.getClass());
        System.out.println(exceptionEvent.getException().getCause());
        exceptionEvent.getException().printStackTrace();
        FacesMessages.error("Error during the user creation");
    }
}
