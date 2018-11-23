package com.sysco.assignmentGayumie.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("test.release", "<release name>");
    public static final String TEST_PROJECT = System.getProperty("test.project", "<project name>");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "false"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String BROWSER_TYPE = System.getProperty("browser.type", "chrome");
    public static final String RUN_HEADLESS = System.getProperty("run.headless", "false");
    public static final String BROWSER_IE = "internet explorer";
    public static final String BROWSER_FIREFOX = "firefox";

    public static final String URL = System.getProperty("url", "https://www.theathletesfoot.com.au/");
    public static final String EMAIL = System.getProperty("Username", "williamjacob802@gmail.com");
    public static final String PASSWORD = System.getProperty("Password", "0okmNHY6");



}