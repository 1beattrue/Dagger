package edu.mirea.onebeattrue.dagger.example1

import javax.inject.Inject

class Activity {
    val monitor = DaggerNewComponent.create().getMonitor()
    val mouse = DaggerNewComponent.create().getMouse()
    val keyboard = DaggerNewComponent.create().getKeyboard()
}