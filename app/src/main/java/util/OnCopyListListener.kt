package com.zaker.android.sapeh.util

import com.zaker.android.sapeh.util.OnCopyListener

/**
 * Created on 18.08.2021.
 * @author Dimowner
 */
interface OnCopyListListener : OnCopyListener {
	fun onStartCopy(name: String)
}
