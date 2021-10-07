package com.example.nav;

public class UserJoinInfo {
    //临时存储用户注册信息
    private static String UserPassword;
    private static boolean UserGender;
    private static Integer UserAge;
    private static Integer UserWeight;
    private static Integer UserHeight;
    private static double kaluli;


    public static void setUserPassword(String userPassword){
        UserJoinInfo.UserPassword=userPassword;
    }

    public static void setUserGender(boolean userGender){
        UserJoinInfo.UserGender=userGender;
        //男为true，女为false
    }

    public static void setUserAge(Integer userBirth){
        UserJoinInfo.UserAge=userBirth;
    }

    public static void setUserWeight(Integer userWeight){
        UserJoinInfo.UserWeight=userWeight;
    }

    public static void setUserHeight(Integer userHeight){
        UserJoinInfo.UserHeight=userHeight;
    }

    public static String getUserPassword() {
        return UserPassword;
    }

    public static boolean getUserGender() {
        return UserGender;
    }

    public static Integer getUserWeight() {
        return UserWeight;
    }

    public static Integer getUserAge() {
        return UserAge;
    }

    public static Integer getUserHeight() {
        return UserHeight;
    }

    public static double getKaluli(){return kaluli;}

    public static void setKaluli(boolean userGender, Integer userAge, Integer userWeight) {
        if (userGender == true) {
            if (userAge <= 30){
                UserJoinInfo.kaluli = (15.2 * userWeight + 680)  * 4.184;
            }
            else if (userAge <= 60){
                UserJoinInfo.kaluli = (11.5 * userWeight + 830)  * 4.184;
            }
            else {
                UserJoinInfo.kaluli = (13.4 * userWeight + 490)  * 4.184;
            }
        }
        else {
            if (userAge <= 30){
                UserJoinInfo.kaluli = (14.6 * userWeight + 450)  * 4.184;
            }
            else if (userAge <= 60){
                UserJoinInfo.kaluli = (8.6 * userWeight + 830)  * 4.184;
            }
            else {
                UserJoinInfo.kaluli = (10.4 * userWeight + 600)  * 4.184;
            }
        }
    }
}

