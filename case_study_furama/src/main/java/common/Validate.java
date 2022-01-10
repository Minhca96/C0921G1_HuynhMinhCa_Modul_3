package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX_CUSTOMER_ID = "^(KH-)\\d{4}$";
    private static final String REGEX_PHONE = "^(09|\\(84\\)\\+9)[01]\\d{7}$";
    private static final String REGEX_DATE = "^\\d{4}(\\/|-)\\d{2}(\\/|-)\\d{2}$";
    private static final String REGEX_ID_CARD = "^\\d{9}|\\d{12}$";
    private static final String REGEX_EMAIL = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";

    public static boolean regexPhone(String phone)  {
        pattern = Pattern.compile(REGEX_PHONE);
        matcher = pattern.matcher(phone);
        if (!matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean regexIdCard(String idCard)  {
        if (idCard.matches(REGEX_ID_CARD)) {
            return true;
        }
        return false;
    }

    public static boolean regexDate(String date)  {
        if( date.matches(REGEX_DATE)) {
           return true;
        }
        return false;
    }


//
//    public static void regexIdCard(String idCard) throws IdCardException {
//        pattern = Pattern.compile(REGEX_ID_CARD);
//        matcher = pattern.matcher(idCard);
//        if (!matcher.find()) throw new IdCardException("IdCard Format Exception (XXXXXXXX) | (XXXXXXXXXXX)!!!");
//    }
//
    public static boolean regexEmail(String email)  {
        if (email.matches(REGEX_EMAIL)){
            return true;
        }
        return false;
    }
//
//    public static void regexNumberInt(int number) throws NumberFormatException {
//        if (number <= 0) throw new NumberFormatException("Number Format Exception (X > 0)!!!");
//    }
//
//    public static void regexNumberDouble(double number) throws NumberFormatException {
//        if (number <= 0) throw new NumberFormatException("Number Format Exception (X > 0)!!!");
//    }

}
