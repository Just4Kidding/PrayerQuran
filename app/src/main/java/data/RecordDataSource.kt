package com.zaker.android.sapeh.data

import com.zaker.android.sapeh.data.database.LocalRepository
import com.zaker.android.sapeh.data.database.Record

class RecordDataSource(
    private val localRepository: LocalRepository,
    private val prefs: Prefs,
) {

    private var activeRecord: Record? = null
    var recordingRecord: Record? = null

    fun getActiveRecord(): Record? {
        synchronized(this) {
            val id = prefs.activeRecord.toInt()
            return if (activeRecord != null && activeRecord?.id == id) {
                activeRecord
            } else if (id >= 0) {
                activeRecord = localRepository.getRecord(id)
                activeRecord
            } else {
                null
            }
        }
    }

    fun clearActiveRecord() {
        activeRecord = null
    }
}
