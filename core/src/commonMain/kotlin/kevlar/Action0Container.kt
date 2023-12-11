@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package kevlar

import kotlinx.JsExport

interface Action0Container<out R> : Action0<R>, ActionContainer<() -> R>