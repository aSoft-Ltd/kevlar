@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kevlar

import kotlin.js.JsExport

interface ActionInvoker<out H> : Action<H> {
    val handler: H
}