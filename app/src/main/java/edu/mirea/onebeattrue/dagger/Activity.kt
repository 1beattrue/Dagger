package edu.mirea.onebeattrue.dagger

class Activity {
    lateinit var computer: Computer

    init {
        Component().inject(this)
    }
}