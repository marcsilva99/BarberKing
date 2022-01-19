package com.example.barberking.Jogo

import com.example.barberking.R

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Qual o livro mais vendido do mundo?",
            R.drawable.ic_livro,
            "Dom Quixote", "O Código Da Vinci",
            "O Diária de Anne Frank", "Biblia", 4
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Quem foi responsável por esta pintura no teto da capela sistina?",
            R.drawable.ic_capela,
            "Vincent Van Gogh", "Pablo Picasso",
            "Miguel Ângelo", "Salvador Dalí", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Qual o planeta localizado entre Marte e Saturno no sistema solar?",
            R.drawable.ic_solar,
            "Terra", "Neptuno",
            "Venus", "Jupiter", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "A França tem fronteira com qual do conjunto de países?",
            R.drawable.ic_franca,
            "Belgica, Luxemburgo, Alemanha, Suíça, Itália, Espanho e Androrra", "Belgica, Suiça, Espanha, Alemanha, Austria e Andorra",
            "Belgica, Suiça, Espanha e Andorra", "Belgica, Espanha, Andorra e Alemanha", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Enquanto Profissional, quantos clubes representou Cristiano Ronaldo",
            R.drawable.ic_cr7,
            "4", "5",
            "3", "6", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Qual das musicas não é da banda Queen",
            R.drawable.ic_queen,
            "Save Me", "I Want To Break Free",
            "Bohemian Rhapsody", "Another Brick in the Wall", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Quem foi o ultimo português/a a conquista uma medalha de ouro olimpica",
            R.drawable.ic_olimpicos,
            "Patricia Mamoa", "Nelson Évora",
            "Pedro Pichardo", "Fernando Pimenta", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Em qual estação do ano a barba tem tendencia para crescer mais?",
            R.drawable.ic_barba,
            "Inverno", "Outono",
            "Primavera", "Verão", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Qual o local que todos os anos entra em primeiro lugar no ano novo?",
            R.drawable.ic_fogo,
            "Australia", "Kiritimati",
            "Nova Zelandia", "Nauru", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Quantos elementos químicos estão representados na atual tabela periódica",
            R.drawable.ic_tabela,
            "112", "118",
            "80", "120", 2
        )

        questionsList.add(que10)

        return questionsList
    }
}