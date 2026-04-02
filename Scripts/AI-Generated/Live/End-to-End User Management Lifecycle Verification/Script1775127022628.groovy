import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Live.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)
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

"Step 8: Click on input newUser"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/input_newUser'))

"Step 9: Enter input value in input newUser"

WebUI.setText(findTestObject('AI-Generated/Live/Page_home/input_newUser'), input_newUser)

"Step 10: Select option with input value from select newRole"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Live/Page_home/select_newRole'), select_newRole, "label", false)

"Step 11: Click on b userName"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/b_userName'))

"Step 12: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_delete'))

"Step 13: Click on button confirmDelete"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_confirmDelete'))

"Step 14: Click on div userDeletedToast -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/div_userDeletedToast'))

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('End-to-End User Management Lifecycle Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}