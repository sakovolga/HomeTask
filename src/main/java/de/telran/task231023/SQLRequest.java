package de.telran.task231023;

public class SQLRequest {
    public static void main(String[] args) {

        String cars = "{\"model\", \"V-60\", \"country\", \"Germany\", \"city\", \"Berlin\", \"year\", null, \"active\", true}";
        cars = cars.replace("{", "").replace("}", "").replace("\"", "");
        String[] words = cars.split(", ");
        System.out.println(getStringBuilder(words));
    }
    private static StringBuilder getStringBuilder(String[] words) {
        StringBuilder sb = new StringBuilder("SELECT * FROM cars WHERE ");
        for (int i = 1; i < words.length; i += 2){
            if (!words[i].equals("null")) {
                sb.append(words[i - 1]).append(" = '").append(words[i]).append("'");
                if (i != words.length-1) sb.append(" AND ");
            }
        }
        return sb;
    }
}
//    Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
//
//        1) Берем исходную строку с данными из cars
//        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//        Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в условие отбора,
//        которое задается после ключевого слова WHERE в результирующей строке.
//        Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//        Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsinki';