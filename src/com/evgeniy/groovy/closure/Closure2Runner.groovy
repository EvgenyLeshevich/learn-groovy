package com.evgeniy.groovy.closure

import com.evgeniy.groovy.oop.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
//            this
            firstName = "Sveta"
        }
        println closure.thisObject
        println closure.owner //
        println closure.delegate // owner

        def student = new Student("Ivan", "Ivanov", 29)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()
        student.with closure

        println student

        student.getInfo()()
    }
}
