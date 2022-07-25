package Util;

public class StringUtils {
    public static int string2int(String uuid){
        int result = 1;
        int prime=31;

        //zeev - 122 101 101 118
        for (char item:uuid.toCharArray())
        {
            result = result*prime+((int)item);
        }
        return result;

    }
}
