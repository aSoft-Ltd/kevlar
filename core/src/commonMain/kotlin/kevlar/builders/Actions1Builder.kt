package kevlar.builders

import kevlar.Action1
import kevlar.ActionsBuilder
import kevlar.action1

open class Actions1Builder<I, O>(
    val actions: MutableList<Action1<I, O>> = mutableListOf()
) : ActionsBuilder<Action1<I, O>, (I) -> O>() {
    override fun on(name: String, key: String, handler: (I) -> O): Action1<I, O> {
        val action = action1(name, key, handler)
        actions.add(action)
        return action
    }
}