package edu.mirea.onebeattrue.dagger.example1

import dagger.Component
import javax.inject.Inject

@Component
interface NewComponent {
    fun inject(activity: Activity)
}