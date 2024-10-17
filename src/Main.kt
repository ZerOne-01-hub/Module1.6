fun main(){
    val student:Student? = Student()

    student?.let{ st -> //работает с объектом через it, не возвращает выходного значения
        st.hi()
        st.bye()
        st.name = "Kolya"
    }
    println(student?.name)
    val student2 = student?.apply { //работает с параметрами объекта, не вызывает выходного значения
        hi()
        bye()
        name = "Ivan"
    }
    println(student?.name)
    println(student2?.name)

    val ageStudent = Student().run{ //работает с параметрами объекта, возвращает выходного значения
        hi()
        bye()
        name = "Semen"
        age = 10
        age
    }
    println(ageStudent)
    val age2Student = with(Student()){
        hi()
        bye()
        age = 15
        age
    }

    Student().also { st ->
        st.hi()
        st.bye()
        st.name = "Masha"
    }

}