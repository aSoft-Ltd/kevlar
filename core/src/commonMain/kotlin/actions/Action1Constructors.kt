@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction1Impl
import kotlin.js.JsExport

@Deprecated("use kevlar instead")
inline fun <I,O> action1(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> O
): Action1<I, O> = MutableAction1Impl(name, key, handler)

@Deprecated("use kevlar instead")
inline fun <I,O> mutableAction1I0R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> O
): MutableAction1<I, O> = MutableAction1Impl(name, key, handler)