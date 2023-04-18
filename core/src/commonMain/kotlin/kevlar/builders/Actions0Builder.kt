package kevlar.builders

import kevlar.Action0
import kevlar.ActionsBuilder
import kevlar.action0

open class Actions0Builder<R>(
    val actions: MutableList<Action0<R>> = mutableListOf()
) : ActionsBuilder<Action0<R>, () -> R>() {
    override fun on(name: String, key: String, handler: () -> R): Action0<R> {
        val action = action0(name, key, handler)
        actions.add(action)
        return action
    }
}