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
}