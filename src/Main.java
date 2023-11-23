import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User[] users = new User[0];
        User user = new User();
        User currentUser = null;

        Management[] managers = new Management[0];
        Management manager = new Management();
        Management currentManager = null;


        Car car1 = new Car(1, "FERRARI", 30000, Driver.AJYBEK);
        Car car2 = new Car(2, "HONDA", 10000, Driver.ALIASKAR);
        Car car7 = new Car(3, "MRS", 16000, Driver.BILAL);
        Car car3 = new Car(4, "TOYOTA", 20000, Driver.NURISLAM);
        Car car4 = new Car(5, "KIA", 12000, Driver.NURKAMIL);
        Car car5 = new Car(6, "AUDI", 15000, Driver.NURLAN);
        Car car6 = new Car(7, "BMW", 5000, Driver.NURTAAZIM);

        Car[] cars = {car1, car2, car3, car4, car5, car6, car7};

        OuterLoop:
        while (true) {
            System.out.println("""
                    1. Регистрация
                    2. Войти
                    3. Менеджер
                    4. Остановить программу
                    """);

            switch (sc.nextLine()) {
                case "1" -> {
                    User regUser = User.register(new User());
                    users = User.addUsers(users, regUser);

                    System.out.println("Вы успешно зарегистрировались!");
                }
                case "2" -> {
                    User logUser = User.loginUser(users);
                    currentUser = logUser;

                    System.out.println("Добро пожаловать : " + currentUser.getName() + " " + currentUser.getLastName());
                    System.out.println("Ваш счет: $" + currentUser.getChek());

                    InnerLoop:
                    while (true) {
                        System.out.println("""
                                1. FERRARI - Цена: $30.000. 
                                2. HONDA - Цена: $10.000.
                                3. MRS - Цена: $16.000.
                                4. TOYOTA - Цена: $20.000.
                                5. KIA - Цена: $12.000.
                                6. AUDI - Цена: $15.000.
                                7. BMW - Цена: $5000.
                                                                
                                0. Выйти из аккаунт.
                                """);

                        System.out.print("Выберите машину чтобы забронировать: ");

                        int idCar = sc.nextInt();
                        switch (idCar) {
                            case 1 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar - 1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 2 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar - 1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 3 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar -1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 4 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar - 1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 5 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar - 1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 6 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar - 1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 7 -> {
                                if (idCar >= 1 && idCar <= cars.length) {
                                    currentUser.reservationCar(cars[idCar - 1], currentUser);
                                } else {
                                    System.out.print("Не правильная команда!");
                                }
                            }
                            case 0 -> {
                                break InnerLoop;
                            }
                        }
                    }
                }
                case "3" -> {
                    InnerLoopManager:
                    while (true) {
                        System.out.println("""
                                1. Регистрация
                                2. Войти                              
                                """);
                        System.out.print("Выбор: ");

                        int select = sc.nextInt();
                        if (select == 1) {
                            Management regManager = Management.regManager(manager);
                            managers = Management.addMangers(managers, regManager);

                            System.out.println("""
                                    Вы успешно зарегистрировались!
                                    Статус: Менеджер.
                                    
                                    """);
                        } else if (select == 2) {
                            Management logManager1 = Management.logManager(managers);
                            currentManager = logManager1;

                            System.out.println("Добро пожаловать : " + currentManager.getName() + " " + currentManager.getLastName());
                            System.out.println("Статус: Менеджер.");
                            System.out.println("0. Выйти.");

                            System.out.println(Arrays.toString(users));
                            System.out.println(Arrays.toString(cars));

                            int select2 = sc.nextInt();
                            if (select2 == 0){
                                break InnerLoopManager;
                            }
                        }

                    }
                }
                case "4" -> {
                }
            }

        }
    }
}