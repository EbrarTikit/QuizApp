package com.example.quizapp

object Constants{


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    val categories = listOf(
        Category(1, "Countries"),
        Category(2, "Sports"),
        Category(3, "Technology"),
        Category(4,"Space")
    )

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1, 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3, 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4, 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2, 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3, 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1, 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3, 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4, 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2,1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1,1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "The Olympics are held every how many years?",
            R.drawable.ic_olympic_games,
            "1 years", "5 years",
            "4 years", "3 years", 3,2
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "What sport is best known as the ‘king of sports’?",
            R.drawable.ic_crown,
            "Football", "Soccer",
            "Tennis", "Basketball", 2,2
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "How many dimples does an average golf ball have?",
            R.drawable.ic_golf,
            "268", "316",
            "341", "336", 4,2
        )

        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "Which boxer fought against Muhammad Ali and won?",
            R.drawable.ic_boxer,
            "Joe Frazier", "George Foreman",
            "Mike Tyson", "None", 1,2
        )

        questionsList.add(que14)

        // 15
        val que15 = Question(
            15, "What is the only sport to be played on the moon?",
            R.drawable.ic_moon,
            "A round of golf", "Volleyball",
            "Gymnastic", "None", 1,2
        )

        questionsList.add(que15)

        // 16
        val que16 = Question(
            16, "What does NBA stand for?",
            R.drawable.ic_team,
            "National Basketball Assocation", "National Basketball Athletics",
            "National Basketball Authority", "National Baseball Association",
            1,2
        )

        questionsList.add(que16)

        // 17
        val que17 = Question(
            17, "What sport is a lot like softball?",
            R.drawable.ic_football,
            "Football", "Volleyball",
            "Baseball", "None", 3,2
        )

        questionsList.add(que17)

        // 18
        val que18 = Question(
            16, "How many players are on a baseball team?",
            R.drawable.ic_baseball_player,
            "11 players", "9 players",
            "18 players", "10 players", 2,2
        )

        questionsList.add(que18)

        // 19
        val que19 = Question(
            19, " In soccer, what body part can’t touch the ball?",
            R.drawable.ic_soccer,
            "Foot", "Hands",
            "Head", "Chest", 2,2
        )

        questionsList.add(que19)

        // 20
        val que20 = Question(
            20, "Which sport uses a net, a racket, and a shuttlecock?",
            R.drawable.ic_badminton,
            "Tennis", "Ping pong",
            "Badminton", "All of these", 3,2
        )

        questionsList.add(que20)

        return questionsList

    }

    fun getQuestionsByCategory(categoryId: Int): ArrayList<Question> {
        // Filter questions by category ID
        return getQuestions().filter { it.categoryId == categoryId } as ArrayList<Question>
    }

}