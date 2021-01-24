public class homework {
    public static void main(String[] args) {
        System.out.println(test(25, -10));
        System.out.println(test(15, 20));
        System.out.println(test(50, 10));
        System.out.println(test(50, -20));
        System.out.println(test(15, -15));

    }

    public static String test(int agePerson, int temperature) {
        if (temperature < 30 && temperature > -20 && agePerson >= 20 && agePerson <= 45)
            return "Можно идти гулять";
        else if (agePerson < 20 && temperature > 0 && temperature < 28)
            return "Можно идти гулять";
        else if (agePerson > 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять";
        else
            return "“Оставайтесь дома";
    }
   // public static int generateRandomAge(){........}
}
