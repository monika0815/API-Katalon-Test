import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response1=WS.sendRequest(findTestObject('Postman/accesstoken'))
def slurper= new groovy.json.JsonSlurper()
def result=slurper.parseText(response1.getResponseBodyContent())
def access_token= result.access_token
//def Property=ResponseChaining.addBasicAuthorizationProperty().getProperty("access_token")
println 'Authorization:'+access_token
GlobalVariable.access_token1=access_token

RequestObject ro2 = new RequestObject("y")
/*
 * String RequestBody='{ "intent": "CAPTURE", "purchase_units": [ {
 * "reference_id": "d9f80740-38f0-11e8-b467-0ed5f89f718b", "amount": {
 * "currency_code": "USD", "value": "100.00" } } ] }'
 *///ro2.setHttpBody("id": "ab8e52e92deb459596e3911f9f09934c")
ro2.setHttpHeaderProperties("X-Auth-Token" : access_token)
ro2.setRestRequestMethod("POST")
ro2.setRestUrl("https://api-m.sandbox.paypal.com/v2/checkout/orders")

WS.sendRequest(ro2)

//WS.sendRequestAndVerify(findTestObject('Postman/createOrder'))

