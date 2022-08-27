import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password,answer;

        System.out.print("Kullanıcı Adınız: ");
        userName= input.nextLine();
        System.out.print("Şifreniz: ");
        password= input.nextLine();

        if(userName.equals("patika")&&password.equals("patika123"))
        {
            System.out.println("Giriş yapıldı, Hoşgeldiniz..");
        }
        else
        {
            System.out.println("Bilgileriniz Yanlış! Parolanızı sıfırlamak ister misiniz? ");
            System.out.print("E: Evet, H: Hayır");
            answer = input.nextLine();
            switch (answer)
            {
                case "E":
                    System.out.print("Yeni Şifreniz: ");
                    String dummyPassword = input.nextLine();
                    if(dummyPassword.equals(password)){
                        System.out.println("Şuanki şifrenizi kullanamazsınız.");
                        break;
                    }
                    else{
                        password = dummyPassword;
                        System.out.println("Şifre Oluşturuldu.");
                        break;
                    }

                case "H":
                    break;
                default:
                    System.out.println("Hatalı Giriş.");
            }
        }
    }


}