public class Practice {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return (21 - n);
        } else {
            return (n - 21) * 2;
        }
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());

        return front + back;
    }


    public void methodology(String str, String str2) {
        if (str == str2){
            System.out.println("These two strings are equal.");
        }else {
            System.out.println("These two strings are not equal.");
        }
    }
}

