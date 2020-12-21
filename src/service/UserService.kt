package com.martynov.service

import com.martynov.model.UserModel
import com.martynov.repository.UserRepository

class UserService(
    private val repo: UserRepository
) {
    suspend fun getModelByid(id: Long): UserModel? {
        return repo.getById(id)
    }
}