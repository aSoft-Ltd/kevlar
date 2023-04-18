package actions.builders

import actions.Action1
import actions.ActionsBuilder
import actions.action1

@Deprecated("use kevlar instead")
open class Actions1Builder<I, O>(
    val actions: MutableList<Action1<I, O>> = mutableListOf()
) : ActionsBuilder<Action1<I, O>, (I) -> O>() {
    override fun on(name: String, key: String, handler: (I) -> O): Action1<I, O> {
        val action = action1(name, key, handler)
        actions.add(action)
        return action
    }
}