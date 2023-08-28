package edu.mirea.onebeattrue.dagger.example1

import javax.inject.Inject

class ComputerTower @Inject constructor(
    private val processor: Processor,
    private val memory: Memory,
    private val storage: Storage
)