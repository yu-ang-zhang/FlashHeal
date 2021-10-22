package com.example.nav;
/**
 * storing user information
 */
public class UserJoinInfo {
    /**
     * gender
     */
    private static boolean UserGender;
    /**
     * age
     */
    private static Integer UserAge;
    /**
     * current weight
     */
    private static Integer UserWeight;
    /**
     * height
     */
    private static Integer UserHeight;
    /**
     * how many calories should user intake
     */
    private static double kaluli;
    /**
     * goal weight
     */
    private static Integer goalweight;


    /**
     * set user gender,
     * true = male
     * false = female
     */
    public static void setUserGender(boolean userGender){
        UserJoinInfo.UserGender=userGender;
    }
    /**
     * set user age
     */
    public static void setUserAge(Integer userBirth){
        UserJoinInfo.UserAge=userBirth;
    }
    /**
     * set user current weight
     */
    public static void setUserWeight(Integer userWeight){
        UserJoinInfo.UserWeight=userWeight;
    }
    /**
     * set user height
     */
    public static void setUserHeight(Integer userHeight){
        UserJoinInfo.UserHeight=userHeight;
    }
    /**
     * get user gender
     */
    public static boolean getUserGender() {
        return UserGender;
    }
    /**
     * get user current weight
     */
    public static Integer getUserWeight() {
        return UserWeight;
    }
    /**
     * get user age
     */
    public static Integer getUserAge() {
        return UserAge;
    }
    /**
     * get user height
     */
    public static Integer getUserHeight() {
        return UserHeight;
    }
    /**
     * get user calorie intake limit
     */
    public static double getKaluli(){return kaluli;}
    /**
     * set user calorie intake limit
     *
     * format from:
     * 卡路里. (2021). 百度百科. https://baike.baidu.com/item/%E5%8D%A1%E8%B7%AF%E9%87%8C/284236?fr=aladdin
     */
    public static void setKaluli(boolean userGender, Integer userAge, Integer userWeight) {
        if (userGender == true) {
            if (userAge <= 30){
                UserJoinInfo.kaluli = (15.2 * userWeight + 680)  ;
            }
            else if (userAge <= 60){
                UserJoinInfo.kaluli = (11.5 * userWeight + 830)  ;
            }
            else {
                UserJoinInfo.kaluli = (13.4 * userWeight + 490)  ;
            }
        }
        else {
            if (userAge <= 30){
                UserJoinInfo.kaluli = (14.6 * userWeight + 450)  ;
            }
            else if (userAge <= 60){
                UserJoinInfo.kaluli = (8.6 * userWeight + 830)  ;
            }
            else {
                UserJoinInfo.kaluli = (10.4 * userWeight + 600) ;
            }
        }
    }
    /**
     * get user goal weight
     */
    public static Integer getGoalweight() {
        return goalweight;
    }
    /**
     * set user goal weight
     */
    public static void setGoalweight(Integer goalweight) {
        UserJoinInfo.goalweight = goalweight;
    }
}

