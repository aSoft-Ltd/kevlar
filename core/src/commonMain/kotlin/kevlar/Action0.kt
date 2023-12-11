@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlinx.JsExport

interface Action0<out R> : Action<() -> R> {
    override val asInvoker get() = this as? Action0Invoker
    override val asContainer get() = this as? Action0Container
}