package actions.builders

import actions.Action0
import actions.ActionsBuilder
import actions.action0

@Deprecated("use kevlar instead")
open class Actions0Builder<R>(
    val actions: MutableList<Action0<R>> = mutableListOf()
) : ActionsBuilder<Action0<R>, () -> R>() {
    override fun on(name: String, key: String, handler: () -> R): Action0<R> {
        val action = action0(name, key, handler)
        actions.add(action)
        return action
    }
}