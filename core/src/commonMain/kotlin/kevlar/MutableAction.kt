@file:JsExport

package kevlar

import kotlin.js.JsExport

interface MutableAction<H> : Action<H> {
    override var handler: H
}