package kevlar.builders

import kevlar.Action0
import kevlar.ActionsBuilder
import kevlar.action0
import kollections.List
import kollections.MutableList
import kollections.add
import kollections.mutableListOf
import kollections.find

open class Actions0Builder<R>(
    val actions: MutableList<Action0<R>> = mutableListOf()
) : ActionsBuilder<Action0<R>, () -> R>() {

    override fun on(name: String, key: String, handler: () -> R): Action0<R> {
        val action = action0(name, key, handler)
        actions.add(action)
        return action
    }

    override fun sub(name: String, key: String, builder: ActionsBuilder<Action0<R>, () -> R>.() -> Unit) {
        val subBuilder = Actions0Builder<R>().apply(builder)
        return sub(name, key, subBuilder.actions)
    }

    override fun sub(name: String, key: String, actions: List<Action0<R>>) {
        this.actions.add(action0(name, key, actions))
    }

    fun get(): List<Action0<R>> = actions

    fun getOrSet(name: String, key: String = name, handler: () -> R): Action0<R> = actions.find {
        it.name.contentEquals(name, ignoreCase = true)
    } ?: on(name, key, handler)
}