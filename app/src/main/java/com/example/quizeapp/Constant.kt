package com.example.quizeapp

object Constant {

    fun getQuestion():ArrayList<QuestionClass>{
        val QuestionList = ArrayList<QuestionClass>()

        val que1 = QuestionClass(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_america_flag,
            "Sri-Lanka",
            "India",
            "China",
            "America",
            4

        )
        QuestionList.add(que1)

        val que2 = QuestionClass(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_sri_lanka_flag,
            "Sri-Lanka",
            "India",
            "China",
            "America",
            1

        )
        QuestionList.add(que2)

        val que3 = QuestionClass(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_korea_flag,
            "Sri-Lanka",
            "India",
            "Korea",
            "America",
            3

        )
        QuestionList.add(que3)

        val que4 = QuestionClass(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_argentina_flag,
            "Argentina",
            "India",
            "Pakistan",
            "Maldives",
            1

        )
        QuestionList.add(que4)

        val que5 = QuestionClass(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_portugal_flag,
            "Bangalidesh",
            "Nepal",
            "Russia",
            "Portugal",
            4

        )
        QuestionList.add(que5)

        return QuestionList
    }
}