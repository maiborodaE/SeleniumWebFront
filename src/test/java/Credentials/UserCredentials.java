package Credentials;

import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class UserCredentials {

//    Login to u0 TEST:
    public static String baseURL = "https://portal-test.effie.mobi/login";
    public static String login = "u0ba2@mail.ru";
    public static String pswrd = "testPass";
//   Site-menu links:
    public static String activityMenu = "div.left-menu-main > div:nth-of-type(5)";
    public static String constrAnketMenu = "div.parent-list > div:nth-of-type(2) > span.left-menu-sub-item > div > div > div";
    public static String createQHbutton = "div.quest-wrapp > div.paper-header > div.wrap > div.buttons > div:nth-of-type(3) > button > div > span";
    public static String saveQHbutton = "div.button-wrap > button:first-child > div > span";
    public static String deleteQHbutton = "div.buttons > div:first-child > button > div > span";





    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    public static String cookies = "SESSION=3d9482b4-3f6b-4a29-88d3-497b3675d887";

    public static String serverName = "nginx";

    public static Date date = new Date();
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    public static String randomName = dateFormat.format(date);


    public String getRandomName() {
        return randomName;
    }

    public void setRandomName(String randomName) {
        this.randomName = randomName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }





}