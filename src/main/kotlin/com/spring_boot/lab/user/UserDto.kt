package com.spring_boot.lab.user

import com.spring_boot.lab.team.Team
import com.spring_boot.lab.team.TeamDto
import java.time.LocalDateTime


data class UserDto(
    val id: Long,
    val name: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val team: TeamDto,
) {

    constructor(
        id: Long,
        name: String,
        createdAt: LocalDateTime,
        updatedAt: LocalDateTime,
        team: Team
    ) : this(
        id, name, createdAt, updatedAt,
        TeamDto(
            id = team.id!!,
            name = team.name,
            createdAt = team.createdAt!!,
            updatedAt = team.updatedAt!!,
        )
    )

}



