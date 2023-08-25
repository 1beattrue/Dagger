package edu.mirea.onebeattrue.dagger.example1

class Activity {
    lateinit var computer: Computer

    init {
        Component().inject(this)
    }
}