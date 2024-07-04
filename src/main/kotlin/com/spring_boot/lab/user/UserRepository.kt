package com.spring_boot.lab.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository : JpaRepository<User, Long> {

    @Query(
        "SELECT new com.spring_boot.lab.user.UserDto(u.id, u.name, u.createdAt, u.updatedAt, t) FROM User u JOIN u.team t"
    )
    fun findAllProjected(): List<UserDto>


    @Query(
        "SELECT new com.spring_boot.lab.user.UserDto(u.id, u.name, u.createdAt, u.updatedAt, t) " +
                "FROM User u JOIN u.team t WHERE u.id = ?1"
    )
    fun findOneProjectedById(id: Long): UserDto
}
