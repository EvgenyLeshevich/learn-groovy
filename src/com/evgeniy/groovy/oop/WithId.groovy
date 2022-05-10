package com.evgeniy.groovy.oop

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }
}