package com.evgeniy.groovy.dynamic.missing

import com.evgeniy.groovy.oop.Student

class MissingMethodRunner {
    static void main(String[] args) {
        def student = new Student(age: 18)
//        student.test()
        println student.abc

        def map = ["1": 11, "2": 22, "abc": 34] // linkedHashMap
        println map."1" // map.get("1")
        println map.abc

//        spring-data, StudentRepository
        student.findByAge(90)
    }
}
