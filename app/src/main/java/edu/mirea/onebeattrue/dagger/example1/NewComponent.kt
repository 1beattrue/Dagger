package edu.mirea.onebeattrue.dagger.example1

import dagger.Component

@Component
interface NewComponent {
    fun getMouse(): Mouse
    fun getKeyboard(): Keyboard
    fun getMonitor(): Monitor
}