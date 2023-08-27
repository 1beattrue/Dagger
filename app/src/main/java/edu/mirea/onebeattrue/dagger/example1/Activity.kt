package edu.mirea.onebeattrue.dagger.example1

import javax.inject.Inject

class Activity {
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var keyboard: Keyboard

    init {
        DaggerNewComponent.create().inject(this)
    }
}