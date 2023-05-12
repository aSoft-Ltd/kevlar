package kevlar.internal

import kevlar.Action0Invoker

@PublishedApi
internal class Action0InvokerImpl<R>(
    override val name: String,
    override val key: String,
    override val handler: () -> R
) : Action0Invoker<R> {
    override fun invoke() = handler()
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action0Invoker($name)"
    override fun equals(other: Any?) = other is Action0Invoker<Any?> && other.name == name
}