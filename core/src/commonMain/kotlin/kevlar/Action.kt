@file:JsExport

package kevlar

import kotlin.js.JsExport

interface Action<out H> {
    val name: String
    val key: String
    val handler: H
}