package com.zaker.android.sapeh.app.moverecords

import com.zaker.android.sapeh.app.formatRecordInformation
import com.zaker.android.sapeh.app.settings.SettingsMapper
import com.zaker.android.sapeh.data.database.Record

fun recordToMoveRecordsItem(settingsMapper: SettingsMapper, item: Record): MoveRecordsItem {
	return MoveRecordsItem(
		item.id,
		item.name,
		formatRecordInformation(settingsMapper, item.format, item.sampleRate, item.size)
	)
}

fun recordsToMoveRecordsItems(settingsMapper: SettingsMapper, items: List<Record>): List<MoveRecordsItem> {
	return items.map { recordToMoveRecordsItem(settingsMapper, it) }
}
