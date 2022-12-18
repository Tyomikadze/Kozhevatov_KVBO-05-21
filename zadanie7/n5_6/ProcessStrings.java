package zadanie7.n5_6;

public class ProcessStrings implements StrProcessable {

    @Override
    public int countOfSymbols(String str, String sub) {
        int counter = 0;
        int bigcount = 0;
        String temp = "";
        if (!str.contains(sub)) {
            System.out.println("Символа в строке нет");
            return 0;
        } else {
            temp = str;
            while (true) {
                bigcount++;
                if (bigcount >= 1000) {
                    System.out.println("Ошибка, слишком большое число символов ");
                    break;
                }

                if (temp.contains(sub)) {
                    counter++;
                    temp = temp.substring(temp.indexOf(sub) + 1);
                } else {
                    break;
                }
            }
        }
        return counter;
    }
    @Override
    public String oddString(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (i % 2 == 1) {
                newStr.append(str.charAt(i));
            }
        }

        return newStr.toString();
    }

    @Override
    public String invertString(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        ProcessStrings a = new ProcessStrings();
        System.out.println(a.countOfSymbols(" rumba in ma heart", "a"));
        System.out.println(a.countOfSymbols(" rumba in ma heart", "p"));
        System.out.println(a.invertString("GODNESS"));
        System.out.println(a.oddString("AMAMIUIU"));
    }
}
