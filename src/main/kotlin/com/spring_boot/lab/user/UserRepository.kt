package com.spring_boot.lab.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository : JpaRepository<User, Long> {

    @Query(
        "SELECT new com.spring_boot.lab.user.UserDto(u.id, u.name, u.createdAt, u.updatedAt, t) FROM User u JOIN u.team t"
    )
    fun findAllProjected(): List<UserDto>


    // JPQL 프로젝션을 사용할 때 DTO에 객체 필드가 있다면 엔티티로 받은 다음 DTO 클래스에서 매핑해줘야 함
    @Query(
        "SELECT new com.spring_boot.lab.user.UserDto(u.id, u.name, u.createdAt, u.updatedAt, t) " +
                "FROM User u JOIN u.team t WHERE u.id = ?1"
    )
    fun findOneProjectedById(id: Long): UserDto
}
