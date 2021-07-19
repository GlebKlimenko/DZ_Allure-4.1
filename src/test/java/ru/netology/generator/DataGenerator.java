package ru.netology.generator;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

    public class DataGenerator {
        static Faker faker = new Faker(new Locale("ru"));
        private static String [] city = {"Екатеринбург", "Москва", "Калининград", "Кемерово", "Тверь", "Кострома", "Краснодар",
                "Красноярск", "Курск", "Санкт-Петербург", "Чебоксары"};
        private static String [] cityNoVal = {"Мегион", "Кизляр", "Урус-Мартан", "Снежинск", "Кингисепп", "Заринск", "Курганинск"};

        private DataGenerator() {
        }

        public static String cityForInput() {
            Random random = new Random();
            int rand = random.nextInt(city.length);
            return city[rand];
        }

        public static String dataPhone() {
            String phone = faker.phoneNumber().phoneNumber();
            return phone;
        }

        public static String dataName() {
            String name = faker.name().lastName();
            name = name + " " + faker.name().firstName();
            return name;
        }

        public static String dataInput(int days) {
            String inputDate = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
            return inputDate;
        }

        public static String cityNoVal() {
            Random random = new Random();
            int rand = random.nextInt(cityNoVal.length);
            return cityNoVal[rand];
        }
    }