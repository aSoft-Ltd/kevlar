@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "NOTHING_TO_INLINE")

package kevlar

import kevlar.internal.Action0ContainerImpl
import kevlar.internal.Action0InvokerImpl
import kollections.List
import kotlinx.JsExport
import kotlin.js.JsName

inline fun <T> action0(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> T
): Action0Invoker<T> = Action0InvokerImpl(name, key, handler)

@JsName("action0Container")
inline fun <T> action0(
    name: String,
    key: String = name.lowercase(),
    actions: List<Action0<T>>
): Action0Container<T> = Action0ContainerImpl(name, key, actions)