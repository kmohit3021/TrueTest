import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.Live.common.signInWithUsernameAndPassword
import truetest.Live.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1133, 312)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Enter username and password to sign in"

signInWithUsernameAndPassword.execute(input_password, input_username)

"Step 3: Enter username and password to sign in"

signInWithUsernameAndPassword.execute(input_password_1, input_username_1)

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Access via URL and Login with Valid Credentials_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}