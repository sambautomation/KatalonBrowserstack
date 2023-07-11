package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginSteps {
    @Given('I can acess to the home page')
    public void i_can_acess_to_the_home_page() {
        WebUI.openBrowser("")
        WebUI.navigateToUrl('https://prestashop-agiltoo-academy.northeurope.cloudapp.azure.com/fr/')
    
    }
    
    @And('I click on Connexion')
    public void i_click_on_Connexion() {
        WebUI.click(findTestObject('Object Repository/Page_Identifiant/span_Connexion'))
        
    }
    
    @When('I enter a login,password with (.+), (.+)')
    public void i_enter_a_login_password_with(String login, String password) {
        WebUI.setText(findTestObject('Object Repository/Page_Identifiant/input_E-mail_email'), login)
        WebUI.setText(findTestObject('Object Repository/Page_Identifiant/input_Mot de passe_password'), password)
        
        
    }
    
    @And('I click on button to connect')
    public void i_click_on_button_to_connect() {
        WebUI.click(findTestObject('Object Repository/Page_Identifiant/button_Connexion'))
        
    }
    
    @Then('I can be successfully logged in on account (.+)')
    public void i_can_be_successfully_logged_in_on_account(String name) {
        WebUI.verifyElementText(findTestObject('Object Repository/Page_Mon compte/verifyConnect'), name)
    
    }

}