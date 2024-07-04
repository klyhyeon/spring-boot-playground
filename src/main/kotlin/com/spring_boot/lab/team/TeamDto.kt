package com.spring_boot.lab.team

import java.time.LocalDateTime


data class TeamDto(
    val id: Long,
    val name: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
) {

}



