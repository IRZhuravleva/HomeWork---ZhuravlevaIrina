import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

            Scanner pochta = new Scanner (System.in); //Ввести количество посылок
            System.out.println("Введите количество коробок");
            int korobki = pochta.nextInt();
            System.out.println("Ваше число: " + korobki);


           //Введите вес коробок
           System.out.println("Введите вес коробок:");
           float massa = (float) pochta.nextDouble();
           System.out.println("Вес: " + massa);

           //Имя получателя
           System.out.println("Имя: ");
           Scanner pochta1=new Scanner(System.in);
           String name = pochta1.nextLine();

           //Фамилия пользователя
           System.out.println("Фамилия: ");
           Scanner pochta2=new Scanner(System.in);
           String surname = pochta1.nextLine();

           //Адрес получателя
           System.out.println("Adresse: ");
           Scanner pochta3=new Scanner(System.in);
           String adresse = pochta1.nextLine();

        System.out.print("Получатель:" + " \"" + name.toUpperCase() + " " + surname.toUpperCase()+ "\""+"\n"+
                "Адрес: " + "\"" +adresse.toUpperCase() + "\"" + "\n"+ "Вес: " + (korobki*massa) + "кг" + "\n" );

        Scanner pochta4 = new Scanner(System.in);
        System.out.println("Ваши данные корректны? ");
        String pochta4String = pochta4.next();

        boolean Yes = true;
        boolean No = false;









    }
}