package edu.mirea.onebeattrue.dagger.example1

import javax.inject.Inject

class Computer @Inject constructor(
    private val monitor: Monitor,
    private val mouse: Mouse,
    private val keyboard: Keyboard,
    private val computerTower: ComputerTower
)