public class Break_Continue {
    public static void main(String[] args) {
        //Первая часть
        int i1 = 0;
        while(true){
            if(i1==15){
                break;
            }
            System.out.println(i1);
            i1++;
        }
        System.out.println("Мы вышли из цикла.");

        /*Вторая часть__________________________________________________*/

        for(int i2 = 0; i2<=15; i2++){
            if(i2%2==0){
                continue;
            }
            System.out.println("это нечетное число "+i2);
        }
    }
}