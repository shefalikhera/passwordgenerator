
import java.io.*;
import java.util.*;

public class Pswd{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Password Generator and Strength Checker!");
        System.out.println("Do you want to include uppercase letters? (yes/no)");
        String useUpperCase = input.nextLine().toLowerCase();
        System.out.println("Do you want to include lowercase letters? (yes/no)");
        String useLowerCase = input.nextLine().toLowerCase();
        System.out.println("Do you want to include numbers? (yes/no)");
        String useNumbers = input.nextLine().toLowerCase();
        System.out.println("Do you want to include symbols? (yes/no)");
        String useSymbols = input.nextLine().toLowerCase();
        System.out.println("What length do you want the password to be?");
        int length = input.nextInt();
        System.out.println("Enter the name of the file where you want to store the passwords:");
        String fileName = input.next();
        String[] passwordArray = new String[3];
        String[] passwordstatus=new String[3];
        for (int i = 0; i < 3; i++) {
            String password = generatePassword(useUpperCase, useLowerCase, useNumbers, useSymbols, length);
            passwordArray[i] = password;
            passwordstatus[i]=setStatus(passwordArray[i]);
            System.out.println("Password " + (i + 1) + ": " + password);
            System.out.println("Status : "+passwordstatus[i]);
        }
        System.out.println("Choose one password to add in file");
        int num=input.nextInt();
        writepasswordtofile(passwordArray[num-1],fileName);
}

public static String setStatus(String pswd){
String status;
int num=calculatePasswordScore(pswd);
if (num < 25) {
           status="Weak";
        } else if (num < 50) {
          status="Medium";
        } else if (num < 75) {
            status="Good";
        } else {
            status="Strong";
        }
        return status;
}
public static String generatePassword(String useUpperCase, String useLowerCase, String useNumbers, String useSymbols, int length) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?";

        String availableChars = "";
        if (useUpperCase.equals("yes")) {
            availableChars += uppercaseLetters;
        }
        if (useLowerCase.equals("yes")) {
            availableChars += lowercaseLetters;
        }
        if (useNumbers.equals("yes")) {
            availableChars += numbers;
        }
        if (useSymbols.equals("yes")) {
            availableChars += symbols;
        }

        Random random = new Random();
        String password = "";
        for (int i = 0; i < length; i++) {
           
int randomIndex = random.nextInt(availableChars.length());
char randomChar = availableChars.charAt(randomIndex);
password += randomChar;
}
return password;
}
public static int calculatePasswordScore(String password) {
    int score = 0;
    if (password.length() >= 8) {
        score += 10;
    }
    if (password.matches("(?=.*[a-z]).*")) {
        score += 10;
    }
    if (password.matches("(?=.*[A-Z]).*")) {
        score += 10;
    }
    if (password.matches("(?=.*\\d).*")) {
        score += 10;
    }
    if (password.matches("(?=.*[!@#$%^&*()_+-=\\[\\]{}\\\\|;':\",./<>?]).*")) {
        score += 10;
    }
    if (password.matches("(?=.*[a-zA-Z]).*") && password.matches("(?=.*\\d).*")) {
        score += 10;
    }
    if (password.matches("(?=.*[a-zA-Z]).*") && password.matches("(?=.*[!@#$%^&*()_+-=\\[\\]{}\\\\|;':\",./<>?]).*")) {
        score += 10;
    }
    if (password.matches("(?=.*\\d).*") && password.matches("(?=.*[!@#$%^&*()_+-=\\[\\]{}\\\\|;':\",./<>?]).*")) {
        score += 10;
    }
    return score;
}
public static void writepasswordtofile(String pswd,String fileName){
try {
            FileWriter writer = new FileWriter(fileName);
                writer.write("Password : "+pswd);
            writer.close();
            System.out.println("The password : "+pswd+" has been stored to "+fileName+".txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing passwords to file.");
        }
}
} 


