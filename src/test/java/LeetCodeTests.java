import org.junit.jupiter.api.Test;

class LeetCodeTests {
    @Test
    public void transferBrackets() {
        String originStr = "items = [[\"phone\",\"blue\",\"pixel\"],[\"computer\",\"silver\",\"lenovo\"],[\"phone\",\"gold\",\"iphone\"]], ruleKey = \"color\", ruleValue = \"silver\"";
        String res = bracket(originStr);
        System.out.println(res);
    }


    private String bracket(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                sb.append('{');
            } else if (str.charAt(i) == ']') {
                sb.append('}');
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
