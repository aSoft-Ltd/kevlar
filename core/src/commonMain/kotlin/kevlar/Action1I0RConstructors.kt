@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kevlar

import kevlar.internal.MutableAction1Impl
import kotlin.js.JsExport

inline fun <I,O> action1(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> O
): Action1<I, O> = MutableAction1Impl(name, key, handler)

inline fun <I,O> mutableAction1I0R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> O
): MutableAction1<I, O> = MutableAction1Impl(name, key, handler)