import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Live.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1133, 752)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on input username"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/input_username'))

"Step 3: Enter input value in input username"

WebUI.setText(findTestObject('AI-Generated/Live/Page_home/input_username'), input_username)

"Step 4: Click on input password"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/input_password'))

"Step 5: Enter input value in input password"

WebUI.setText(findTestObject('AI-Generated/Live/Page_home/input_password'), input_password)

"Step 6: Click on button signIn"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_signIn'))

"Step 7: Click on div userManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/div_userManagement'))

"Step 8: Click on button deleteUser"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_deleteUser'))

"Step 9: Click on button confirmDelete"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_confirmDelete'))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Confirmation Modal on User Deletion_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}