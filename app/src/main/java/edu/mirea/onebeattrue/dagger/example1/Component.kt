package edu.mirea.onebeattrue.dagger.example1

class Component {
    private fun getComputer(): Computer {
        val processor = Processor()
        val memory = Memory()
        val storage = Storage()
        val computerTower = ComputerTower(processor, memory, storage)
        val mouse = Mouse()
        val keyboard = Keyboard()
        val monitor = Monitor()
        return Computer(monitor, mouse, keyboard, computerTower)
    }

//    fun inject(activity: Activity) {
//        activity.keyboard = Keyboard()
//    }
}