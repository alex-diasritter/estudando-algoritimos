package org.leetcode.strings;

public class LoginValidation {

    private static final String SPECIALS = "!@#$%^&*()-_=+[]{};:,.<>?/\\|`~";
    private static final int MIN_LENGTH = 12;
    private static final int MAX_LENGTH = 64;
    private static final int MAX_CONSECUTIVE_REPEAT = 3;
    private static final int MAX_SEQUENCE_LENGTH = 4;

    public static boolean isValid(String password, String username) {
        if (password == null || username == null) return false;

        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) return false;
        if (password.contains(" ")) return false;
        if (password.toLowerCase().contains(username.toLowerCase())) return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (SPECIALS.indexOf(c) >= 0) hasSpecial = true;
            else return false; // caractere não permitido
        }

        if (!(hasUpper && hasLower && hasDigit && hasSpecial)) return false;
        if (hasConsecutiveRepeats(password, MAX_CONSECUTIVE_REPEAT)) return false;
        if (hasSequentialChars(password, MAX_SEQUENCE_LENGTH)) return false;
        if(!passwordDiferentFromName(username, password)) return false;

        return true;
    }

    private static boolean hasConsecutiveRepeats(String s, int limit) {
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count >= limit) return true;
            } else {
                count = 1;
            }
        }
        return false;
    }

    private static boolean hasSequentialChars(String s, int limit) {
        int asc = 1, desc = 1;
        for (int i = 1; i < s.length(); i++) {
            char prev = Character.toLowerCase(s.charAt(i - 1));
            char curr = Character.toLowerCase(s.charAt(i));

            if ((curr - prev) == 1) asc++;
            else asc = 1;

            if ((prev - curr) == 1) desc++;
            else desc = 1;

            if (asc >= limit || desc >= limit) return true;
        }
        return false;
    }

    public static boolean passwordDiferentFromName (String username, String password) {
        username.toLowerCase();
        if (password.contains(username)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String username = "Joao";
        String senha = "Strong#Senha2025";

        System.out.println(isValid(senha, username) ? "✅ Senha válida" : "❌ Senha inválida");
    }
}