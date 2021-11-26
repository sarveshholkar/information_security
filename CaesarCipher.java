import java.util.*;
public class CaesarCipher{
    static Scanner in = new Scanner(System.in);
    
    public static void main(String arg[]){
            int n;    
            char ch;
            System.out.println("Enter Text ");
            String text = in.nextLine();   //message
            System.out.println("Enter Key ");
            int k = in.nextInt();  //key
            System.out.println("1 for encryptText \n2 for decryptText");
            n = in.nextInt();
            switch(n){
                case 1:
                    String encryptedText = "";
                    for(int i = 0; i < text.length(); ++i){
                    ch = text.charAt(i);
                    if(ch >= 'a' && ch <= 'z'){
                                ch = (char)(ch + k);

                                if(ch > 'z'){
                                    ch = (char)(ch - 'z' + 'a' - 1);
                                }

                                encryptedText += ch;
                            }
                            else if(ch >= 'A' && ch <= 'Z'){
                                ch = (char)(ch + k);

                                if(ch > 'Z'){
                                    ch = (char)(ch - 'Z' + 'A' - 1);
                                }

                                encryptedText += ch;
                            }
                            else {
                             encryptedText += ch;
                            }
                    }
                    System.out.println("Encrypted text = " + encryptedText);
                    break;
                case 2:
                    String decryptedText = "";
                    for(int i = 0; i < text.length(); ++i){
                    ch = text.charAt(i);
                    if(ch >= 'a' && ch <= 'z'){
                                ch = (char)(ch - k);

                                if(ch < 'a'){
                                    ch = (char)(ch + 'z' - 'a' + 1);
                                }

                                decryptedText += ch;
                            }
                            else if(ch >= 'A' && ch <= 'Z'){
                                ch = (char)(ch - k);

                                if(ch < 'A'){
                                    ch = (char)(ch + 'Z' - 'A' + 1);
                                }

                                decryptedText += ch;
                            }
                            else {
                             decryptedText += ch;
                            }
                    }
                    System.out.println("Decrypted Message = " + decryptedText);
                    break;
                default:
                    System.out.println("Enter valid no.");
            }
    }
}