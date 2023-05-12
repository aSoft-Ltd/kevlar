@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlin.js.JsExport

interface Action0Invoker<out R> : Action0<R>, ActionInvoker<() -> R> {
    operator fun invoke(): R
}