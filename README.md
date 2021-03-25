# Android native calender app automation using Appium

Scenario:1.Create a workshop meeting between 9:30 to 1:30pm every friday of the week for the next three months 
Scenario 2. Call a standup to discuss the progress for 15 mins


##Assumptions 

- Android Device is preinstalled with Calendar App
- Calendar App is already logged in with an account

## Prerequisite
1 : node.js is installed and verified
    brew install node
    node -v
    npm -v

2 : Java installed on system and $JAVA_HOME is set in environment variables 
    command to check : 
    java -version
    echo $JAVA_HOME

3 : Android sdk is installed and $ANDROID_HOME AND $PATH variables are set
    command to check : 
    https://developer.android.com/studio
    java -version
    echo $JAVA_HOME

4 : appium  is installed and verified by appium-doctor
    npm install -g appium

    npm install appium-doctor -g
    appium-doctor --android

## Framework

- Appium
- Test tool - TestNg
- Build tool - Maven

### Steps to run

1 . Update the the below desired capabalities with the test device values  in the Constants.java file.
 	PLATFORM_VERSION_VALUE= "11";
	public static final String DEVICE_NAME_VALUE = "Nexus5";
	public static final String UDID_VALUE = "emulator-5554";
  
2. Start the emulator or connect the real device and make sure the device is connected by running
   adb devices
   
3. Start the Appium server from desktop client or running cmd
   appium
   
4. run pom.xml file 

## Test Steps Executed in scenario 1

1.Launch the app

2.navigate through the splash screen

3.Click on + button on in Calender home screen

4.Select Events on the overlay menu

5.Enter Title and Save

Note : The condition Friday between 9:30 am to 1:30 pm for next 3 months is not yet added. 

## Reports

- HTML report

  ```sh
  test-output/old/index.html
  ```

- XML report

  ```sh
  test-output/old/testng-results.xml
  ```
