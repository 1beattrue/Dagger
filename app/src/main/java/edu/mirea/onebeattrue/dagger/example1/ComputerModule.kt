package edu.mirea.onebeattrue.dagger.example1

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
class ComputerModule {
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideComputerTower(
        processor: Processor,
        memory: Memory,
        storage: Storage
    ): ComputerTower {
        return ComputerTower(processor, memory, storage)
    }

    @Provides
    fun provideComputer(
        mouse: Mouse,
        monitor: Monitor,
        keyboard: Keyboard,
        computerTower: ComputerTower
    ): Computer {
        return Computer(monitor, mouse, keyboard, computerTower)
    }
}