package io.github.gdiazs.javaee8.register;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class RegisterController {

    @Inject
    private RegisterFormModel registerModel;

    @Inject
    private RegisterService registerService;



    public void addNewUser(){
        registerService.createNewActiveUser(registerModel.getUsername());
    }


}
