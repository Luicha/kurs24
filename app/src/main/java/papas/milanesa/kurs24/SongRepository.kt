package papas.milanesa.kurs24

class SongRepository {

    // This function simulates fetching data synchronously
    fun getSongListForCategory(categoryId: Int): List<Song> {
        // Replace this with your actual data fetching logic
        // For simplicity, let's assume you have a static list of songs for each category

        return when (categoryId) {
            1 -> listOf(
                Song("6:45 - 7:30", "Божественна літургія"),
                Song("7:30 - 8:00", "Сніданок"),
                Song("8:10 - 8:55", "Культура І"),
                Song("9:00 - 11:00", "Мова"),
                Song("11:05 - 11:50", "Теологія"),
                Song("11:50 - 12:35", "Візантійський обряд"),
                Song("12:45 - 13:30", "Обід"),
                Song("13:30 - 15:30", "Відпочинок"),
                Song("15:30 - 16:30", "Практика культури"),
                Song("16:30 - 18:30", "Мова"),
                Song("18:30 - 19:10", "Історія І"),
                Song("19:10 - 19:50", "Географія І"),
                Song("20:00 - 20:30", "Вечеря"),
                Song("20:30 - 21:00", "Спів"),
                Song("21:00 - 22:00", "Розмови, фільми, ігри"),
                Song("22:00 - 0:00", "Нічна тиша, навчання"),

            )
            2 -> listOf(
                Song("6:45 - 7:30", "Божественна літургія"),
                Song("7:30 - 8:00", "Сніданок"),
                Song("8:10 - 8:55", "Культура ІІ"),
                Song("9:00 - 11:00", "Мова"),
                Song("11:05 - 11:50", "Теологія ІІ"),
                Song("11:50 - 12:35", "Історія ІІ"),
                Song("12:45 - 13:30", "Обід"),
                Song("13:30 - 15:30", "Відпочинок"),
                Song("15:30 - 16:30", "Практика культури"),
                Song("16:30 - 18:30", "Мова"),
                Song("18:30 - 19:10", "Візантійський обряд ІІ"),
                Song("19:10 - 19:50", "Географія ІІ"),
                Song("20:00 - 20:30", "Вечеря"),
                Song("20:30 - 21:00", "Спів"),
                Song("21:00 - 22:00", "Розмови, фільми, ігри"),
                Song("22:00 - 0:00", "Нічна тиша, навчання"),
            )

            3 -> listOf(
                Song("6:45 - 7:30", "Божественна літургія"),
                Song("7:30 - 8:00", "Сніданок"),
                Song("8:10 - 8:55", "Література І"),
                Song("9:00 - 11:00", "Мова"),
                Song("11:05 - 11:50", "Історія вселенської церкви"),
                Song("11:50 - 12:35", "Культура ІІІ"),
                Song("12:45 - 13:30", "Обід"),
                Song("13:30 - 15:30", "Відпочинок"),
                Song("15:30 - 16:30", "Практика культури"),
                Song("16:30 - 18:30", "Мова"),
                Song("18:30 - 19:10", "Література І"),
                Song("19:10 - 19:50", "Історія ІІІ"),
                Song("20:00 - 20:30", "Вечеря"),
                Song("20:30 - 21:00", "Спів"),
                Song("21:00 - 22:00", "Розмови, фільми, ігри"),
                Song("22:00 - 0:00", "Нічна тиша, навчання"),
            )

            4 -> listOf(
                Song("6:45 - 7:30", "Божественна літургія"),
                Song("7:30 - 8:00", "Сніданок"),
                Song("8:10 - 8:55", "Література ІІ"),
                Song("9:00 - 11:50", "Мова"),
                Song("11:50 - 12:35", "Історія української церкви"),
                Song("12:45 - 13:30", "Обід"),
                Song("13:30 - 15:30", "Відпочинок"),
                Song("15:30 - 16:30", "Практика культури"),
                Song("16:30 - 18:30", "Мова"),
                Song("18:30 - 19:10", "Культура IV"),
                Song("19:10 - 19:50", "Історія IV"),
                Song("20:00 - 20:30", "Вечеря"),
                Song("20:30 - 21:00", "Спів"),
                Song("21:00 - 22:00", "Розмови, фільми, ігри"),
                Song("22:00 - 0:00", "Нічна тиша, навчання"),
            )

            5 -> listOf(
                Song("6:45 - 7:30", "Божественна літургія"),
                Song("7:30 - 8:00", "Сніданок"),
                Song("8:10 - 8:55", "Філософія"),
                Song("9:00 - 11:00", "Мова"),
                Song("11:05 - 11:50", "Література ІІІ"),
                Song("11:50 - 12:35", "Культура V"),
                Song("12:45 - 13:30", "Обід"),
                Song("13:30 - 15:30", "Відпочинок"),
                Song("15:30 - 16:30", "Практика культури"),
                Song("16:30 - 19:50", "Мова"),
                Song("20:00 - 20:30", "Вечеря"),
                Song("20:30 - 21:00", "Спів"),
                Song("21:00 - 22:00", "Розмови, фільми, ігри"),
                Song("22:00 - 0:00", "Нічна тиша, навчання"),
            )


            // Add more cases for other categories
            else -> emptyList()
        }
    }
}
