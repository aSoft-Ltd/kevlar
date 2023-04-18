@file:JsExport

package actions

import kotlin.js.JsExport

@Deprecated("use kevlar instead")
interface MutableAction<H> : Action<H> {
    override var handler: H
}