package com.Register.Entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegisterEntities {

    @NotBlank(message = "User Name Can not be empty !! ")
    @Size( min = 3,max =12, message = "User name must be between 3 - 12 Characters" )
   
    private String userName;
    
   
   @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email")
	private String email;
   
   
   private boolean agreed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "RegisterEntities [userName=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
	}
    
}
