package kevlar.internal

import kevlar.Action
import kevlar.Action1Container
import kollections.List

@PublishedApi
internal class Action1ContainerImpl<I, R>(
    override val name: String,
    override val key: String,
    override val actions: List<Action<(I) -> R>>
) : Action1Container<I, R> {
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action1Invoker($name)"
    override fun equals(other: Any?) = other is Action1Container<*, *> && other.name == name
}