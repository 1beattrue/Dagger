package edu.mirea.onebeattrue.dagger.example1

import javax.inject.Inject

class Activity {

    @Inject // переменная должна быть public, иначе dagger не сможет вставить зависимость
    lateinit var keyboard: Keyboard // первый способ - создание зависимости инъекцией

    // эту уже можно делать private, но в данном случае мы обращаемся к ней внутри MainActivity
    val mouse: Mouse = DaggerNewComponent.create().getMouse() // второй способ - с помощью getter'а

    init {
        DaggerNewComponent.create().inject(this)
    }
}