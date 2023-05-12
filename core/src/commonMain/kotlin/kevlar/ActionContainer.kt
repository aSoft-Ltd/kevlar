@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package kevlar

import kollections.List
import kotlin.js.JsExport

interface ActionContainer<out H> : Action<H> {
    val actions: List<Action<H>>
}