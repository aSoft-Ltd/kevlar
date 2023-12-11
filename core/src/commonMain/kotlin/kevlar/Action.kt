@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kevlar

import kotlinx.JsExport

interface Action<out H> {
    val name: String
    val key: String

    val asInvoker get() = this as? ActionInvoker
    val asContainer get() = this as? ActionContainer
}