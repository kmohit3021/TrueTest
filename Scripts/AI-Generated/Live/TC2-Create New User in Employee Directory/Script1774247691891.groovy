import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Live.common.signInWithUsernameAndPassword
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

"Step 2: Enter username and password to sign in"

signInWithUsernameAndPassword.execute(input_password, input_username)

"Step 3: Click on div userManagement"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/div_userManagement'))

"Step 4: Click on input newUser"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/input_newUser'))

"Step 5: Enter input value in input newUser"

WebUI.setText(findTestObject('AI-Generated/Live/Page_home/input_newUser'), input_newUser)

"Step 6: Select option with input value from select newRole"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Live/Page_home/select_newRole'), select_newRole, "label", false)

"Step 7: Select option with input value from select newStatus"

TrueTestScripts.selectOption(findTestObject('AI-Generated/Live/Page_home/select_newStatus'), select_newStatus, "label", false)

"Step 8: Click on button addUser"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/button_addUser'))

"Step 9: Click on div userCreatedToast -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Live/Page_home/div_userCreatedToast'))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Create New User in Employee Directory_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}