@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "NOTHING_TO_INLINE")

package kevlar

import kevlar.internal.Action1ContainerImpl
import kevlar.internal.Action1InvokerImpl
import kollections.List
import kotlin.js.JsExport
import kotlin.js.JsName

inline fun <I, O> action1(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> O
): Action1Invoker<I, O> = Action1InvokerImpl(name, key, handler)

@JsName("action1Container")
inline fun <I, O> action1(
    name: String,
    key: String = name.lowercase(),
    actions: List<Action1<I, O>>
): Action1Container<I, O> = Action1ContainerImpl(name, key, actions)

//@Deprecated("we are thinking of moving away from mutable actions")
//inline fun <I, O> mutableAction1(
//    name: String,
//    key: String = name.lowercase(),
//    noinline handler: (I) -> O
//): MutableAction1<I, O> = MutableAction1InvokerImpl(name, key, handler)