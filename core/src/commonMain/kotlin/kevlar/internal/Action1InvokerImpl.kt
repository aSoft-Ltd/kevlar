package kevlar.internal

import kevlar.Action1Invoker

@PublishedApi
internal class Action1InvokerImpl<I, R>(
    override val name: String,
    override val key: String,
    override val handler: (I) -> R
) : Action1Invoker<I, R> {

    override operator fun invoke(arg: I) = handler(arg)
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action1Container($name)"
    override fun equals(other: Any?) = other is Action1Invoker<*, *> && other.name == name
}