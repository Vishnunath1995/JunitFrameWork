package org.Pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	
public Login() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="email")
private WebElement username;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getButton() {
	return button;
}

@FindBy(id="pass")
private WebElement password;

@FindBy(xpath="//button[@name='login']")
private WebElement button;


}
