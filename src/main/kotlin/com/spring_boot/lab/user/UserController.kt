package com.spring_boot.lab.user

import com.spring_boot.lab.team.Team
import com.spring_boot.lab.team.TeamRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/lab")
class UserController(
    private val userRepository: UserRepository,
    private val teamRepository: TeamRepository,
) {


    @PostMapping("/user-team")
    fun newUserNewTeam(): UserDto {
        val newTeam = teamRepository.save(
            Team(
                name = "team${Random.nextInt()}",
            )
        )
        val newUser = userRepository.save(
            User(
                name = "test${Random.nextInt()}",
                team = newTeam,
            )
        )
        return userRepository.findOneProjectedById(newUser.id!!)
    }
}