<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>updateOrder</name>
   <tag></tag>
   <elementGuidId>88580dec-499e-4f45-9635-112111a0e69b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;[\n  {\n    \&quot;op\&quot;: \&quot;replace\&quot;,\n    \&quot;path\&quot;: \&quot;/purchase_units/@reference_id\u003d\u003d\u0027PUHF\u0027/shipping/address\&quot;,\n    \&quot;value\&quot;: {\n      \&quot;address_line_1\&quot;: \&quot;2211 N First Street\&quot;,\n      \&quot;address_line_2\&quot;: \&quot;Building 17\&quot;,\n      \&quot;admin_area_2\&quot;: \&quot;San Jose\&quot;,\n      \&quot;admin_area_1\&quot;: \&quot;CA\&quot;,\n      \&quot;postal_code\&quot;: \&quot;95131\&quot;,\n      \&quot;country_code\&quot;: \&quot;US\&quot;\n    }\n  }\n]&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
      <webElementGuid>6286a4b2-2468-47d3-98be-d58af0a7c782</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${accessToken}</value>
      <webElementGuid>70ee4121-7623-444f-8c3d-8cc3ebffd001</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api-m.paypal.com/v2/checkout/orders/${getOrderDetails}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>016105b7-17dd-4fb1-b61b-33cc7f5adc6a</id>
      <masked>false</masked>
      <name>URLGet</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.access_token1</defaultValue>
      <description></description>
      <id>7369244b-ab35-4e4c-af37-bae1ba24da59</id>
      <masked>false</masked>
      <name>accessToken</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.GETORDERDETAILS</defaultValue>
      <description></description>
      <id>8d86a657-14af-426d-9074-d5f3eba54e53</id>
      <masked>false</masked>
      <name>getOrderDetails</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
