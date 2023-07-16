public class If {
    public static void main(String[] args) {
        int myInt = 5;
        if (myInt<10){                      //true
            System.out.println("да, верно.");
        } else if (myInt<20){               //не исполнится
            System.out.println("нет, не верно.");
        }
    }
}