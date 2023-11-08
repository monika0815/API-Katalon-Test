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
import com.kms.katalon.core.webservice.keyword.builtin.ValidateJsonAgainstSchemaKeyword as ValidateJsonAgainstSchemaKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static org.junit.Assert.assertEquals
import org.openqa.selenium.Keys as Keys

response1 = WS.sendRequest(findTestObject('Postman/accesstoken'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response1.getResponseBodyContent())

def access_token = result.access_token

//def Property=ResponseChaining.addBasicAuthorizationProperty().getProperty("access_token")
println('Authorization:' + access_token)

GlobalVariable.access_token1 = access_token

//WS.sendRequest(findTestObject('Postman/createOrder'))
response2 = WS.sendRequestAndVerify(findTestObject('Postman/createOrder'))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(response2.getResponseBodyContent())

def URL = result1.links[0].href

def createOrderId = result1.id

println('Result is:' + result1)

println('url is:' + URL)

GlobalVariable.URL = URL

//GlobalVariable.createOrderId=createOrderId
/*
 * String[] URLSplit=URL.split(",") for(int i=0;i<URLSplit.length;i++) {
 * if(i==0) { System.out.println("splitted data:"+URLSplit[i]) break } }
 */
//GlobalVariable.createOrderId=URL
response3 = WS.sendRequest(findTestObject('Postman/showOrderDetails'))

def slurper2 = new groovy.json.JsonSlurper()

def result2 = slurper2.parseText(response3.getResponseBodyContent())

def getOrderID = result2.id

GlobalVariable.GETORDERDETAILS = getOrderID

println('Result of Get request:' + result2)

assertEquals(createOrderId, getOrderID)

//ValidateJsonAgainstSchemaKeyword.
//Validate
//updateOrderRequest = ws.sendRequest(findTestObject('Postman/updateOrder'))



