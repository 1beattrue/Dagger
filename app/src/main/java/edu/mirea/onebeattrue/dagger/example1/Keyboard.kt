package edu.mirea.onebeattrue.dagger.example1

import javax.inject.Inject

class Keyboard @Inject constructor() { // если какому-то объекту необходима зависимость клавиатура, dagger создает пустой конструктор
}