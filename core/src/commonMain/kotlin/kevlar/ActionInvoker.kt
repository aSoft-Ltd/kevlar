@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kevlar

import kotlinx.JsExport

interface ActionInvoker<out H> : Action<H> {
    val handler: H
}