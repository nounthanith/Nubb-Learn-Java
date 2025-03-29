public class Loop {
    public static void loop(){

        String[] names = {"Rong", "Tong", "Ting", "Pich", "Hayabusa\n"};

        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }

        String[] cars = {"Bmw", "Toyota", "Nisan", "Tesla", "Lambo"};

        for (int car = 0; car < cars.length; car++){
            System.out.print(cars[car] + " ");
        }
    }
}
