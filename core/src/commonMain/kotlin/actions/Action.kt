@file:JsExport

package actions

import kotlin.js.JsExport

@Deprecated("use kevlar instead")
interface Action<out H> {
    val name: String
    val key: String
    val handler: H
}