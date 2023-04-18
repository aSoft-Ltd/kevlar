@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction0Impl
import kotlin.js.JsExport

inline fun <T> action0(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> T
): Action0<T> = MutableAction0Impl(name, key, handler)

inline fun <T> mutableAction0(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> T
): MutableAction0<T> = MutableAction0Impl(name, key, handler)