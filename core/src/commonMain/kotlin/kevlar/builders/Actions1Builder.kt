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

    override fun sub(name: String, key: String, builder: ActionsBuilder<Action1<I, O>, (I) -> O>.() -> Unit) {
        val subBuilder = Actions1Builder<I, O>().apply(builder)
        sub(name, key, subBuilder.actions)
    }

    override fun sub(name: String, key: String, actions: List<Action1<I, O>>) {
        this.actions.add(action1(name, key, actions))
    }
}