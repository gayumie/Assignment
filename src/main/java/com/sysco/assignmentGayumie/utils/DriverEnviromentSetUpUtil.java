package com.sysco.assignmentGayumie.utils;

import com.sysco.assignmentGayumie.common.Constants;
import com.syscolab.qe.core.ui.SyscoLabCapabilityUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverEnviromentSetUpUtil {

    static Logger logger = Logger.getLogger(DriverEnviromentSetUpUtil.class);
    private DriverEnviromentSetUpUtil() {

    }


    public static void setToRunLocallyWithBrowser(String driver) {
        String osArchitecture = "os.arch";
        if (driver.equals(BrowserType.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/firefox_driver/" + System.getProperty (osArchitecture) + "/geckodriver");
            logger.info(System.getProperty("webdriver.firefox.driver"));
        } else if (driver.equals(BrowserType.IE)) {
            System.setProperty("webdriver.ie.driver", "src/main/resources/ie_driver/" + System.getProperty(osArchitecture) + "/IEDriverServer");
            logger.info(System.getProperty("webdriver.ie.driver"));
        } else {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_driver/" + System.getProperty(osArchitecture) + "/chromedriver");
            logger.info(System.getProperty("webdriver.chrome.driver"));
        }

    }

    public static Capabilities setToRunRemotely() {
        DesiredCapabilities capabilities;
        capabilities = SyscoLabCapabilityUtil.getPCCapabilities("WIN 10", "");
        capabilities.setBrowserName(String.valueOf(Constants.BROWSER_TYPE));


        return capabilities;
    }
}


