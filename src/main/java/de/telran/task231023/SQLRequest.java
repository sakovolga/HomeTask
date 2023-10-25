package de.telran.task231023;

public class SQLRequest {
    public static void main(String[] args) {

        String cars = "{\"model\", \"V-60\", \"country\", \"Germany\", \"city\", \"Berlin\", \"year\", null, \"active\", true}";
        cars = getStringWithoutExtraCharacters(cars);  //make String without {}
        String[] words = cars.split(", ");
        String[] rightWords = getArrayWithoutExtaCharacters(words);  //make Strings in array without ""
        System.out.println(getStringBuilder(rightWords));
    }
    private static StringBuilder getStringBuilder(String[] rightWords) {
        StringBuilder sb = new StringBuilder("SELECT * FROM cars WHERE ");
        for (int i = 1; i < rightWords.length; i += 2){
            if (!rightWords[i].equals("null")) {
                sb.append(rightWords[i - 1]).append(" = '").append(rightWords[i]).append("'");
                if (i != rightWords.length-1) sb.append(" AND ");
            }
        }
        return sb;
    }
    private static String[] getArrayWithoutExtaCharacters(String[] words) {
        for (int i = 0; i < words.length; i++){
            if (words[i].contains("\"")) {
                StringBuilder tempWord = new StringBuilder(words[i]);
                tempWord.deleteCharAt(0).deleteCharAt(tempWord.length()-1);
                words[i] = tempWord.toString();
            }
        }
        return words;
    }
    public static String getStringWithoutExtraCharacters(String cars) {
        StringBuilder cars1 = new StringBuilder(cars);
        cars1.deleteCharAt(0).deleteCharAt(cars1.length() - 1);
        return cars1.toString();
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