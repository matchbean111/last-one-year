package org.example.easy;

public class N1678 {
    public static void main(String[] args) {
        N1678 t = new N1678();
        String command = "(al)G(al)()()G";
        String interpret = t.interpret(command);
        System.out.println(interpret);
    }

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
            }
            if (c == '(' && command.charAt(i + 1) == 'a') {
                sb.append("al");
            }
            if (c == 'G') {
                sb.append('G');
            }
        }

        return sb.toString();
    }
}
