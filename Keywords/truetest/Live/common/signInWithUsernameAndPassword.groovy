package truetest.Live.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class signInWithUsernameAndPassword {
    
    private static def execute(String input_password, String input_username) {
        
        "Step 1: Click on input username"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/input_username'))
        
        "Step 2: Enter input value in input username"
        
        WebUI.setText(findTestObject('AI-Generated/Live/Page_home/input_username'), input_username)
        
        "Step 3: Click on input password"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/input_password'))
        
        "Step 4: Enter input value in input password"
        
        WebUI.setText(findTestObject('AI-Generated/Live/Page_home/input_password'), input_password)
        
        "Step 5: Click on button signIn"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_signIn'))
    }
}

