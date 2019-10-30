package com.chsltutorials.monitoramentometrolondres.model.mapper

import com.chsltutorials.monitoramentometrolondres.model.entity.LineStatusModel
import com.chsltutorials.monitoramentometrolondres.model.entity.LineStatus

class LineStatusModelToLineStatusMapper : Mapper<LineStatusModel, LineStatus> {

    override fun map(from: LineStatusModel): LineStatus {
        return LineStatus(
            id = from.id,
            name = from.name,
            severityLevel = from.statusModel[0].severityLevel,
            severityLevelDescription = from.statusModel[0].severityLevelDescription
        )
    }
}

interface Mapper<in FROM, out TO> {

    fun map(from: FROM): TO
}