public class StringToInteger {
    public int atoi(String str) {
        int flag = 1;
        int num = 0;
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                while (ch >= '0' && ch <= '9') {
                    if ((num * 10 + (int)ch)*flag > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else if ((num*10+(int)ch)*flag < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else {
                        num = num*10 + (int)ch;
                    }
                }
                return flag*num;
            } else if (ch == '-') {
                flag = -1;
            }
        }
        return 0;
    }
}
