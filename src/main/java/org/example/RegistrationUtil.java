package org.example;

public class RegistrationUtil {
        boolean validateUserInput(String username, String passWord, String confirmPassword){
            if (username.isEmpty() || passWord.isEmpty() || confirmPassword.isEmpty()){
                 return false;
            }
            if (!passWord.equals(confirmPassword)){
                return  false;
                
            }else {
                return true;
            }
    }
}
