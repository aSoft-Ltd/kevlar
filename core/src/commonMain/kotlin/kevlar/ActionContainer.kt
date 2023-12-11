@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kevlar

import kollections.List
import kotlinx.JsExport

interface ActionContainer<out H> : Action<H> {
    val actions: List<Action<H>>
}