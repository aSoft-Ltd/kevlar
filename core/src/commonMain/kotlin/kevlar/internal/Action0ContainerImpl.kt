package kevlar.internal

import kevlar.Action
import kevlar.Action0Container
import kollections.List

@PublishedApi
internal class Action0ContainerImpl<R>(
    override val name: String,
    override val key: String,
    override val actions: List<Action<() -> R>>
) : Action0Container<R> {
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action0Container($name)"
    override fun equals(other: Any?) = other is Action0Container<Any?> && other.name == name
}