package com.spring_boot.lab.user

import com.spring_boot.lab.team.Team
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
open class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    @ManyToOne
    @JoinColumn(name = "team_id")
    val team: Team? = null,
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime? = null,
) {

    override fun toString(): String {
        return "com.spring_boot.lab.user.User(id=$id, name='$name', createdAt=$createdAt, updatedAt=$updatedAt)"
    }
}
