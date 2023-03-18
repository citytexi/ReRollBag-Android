package com.mediaproject.rerollbag.di

import com.mediaproject.data.repository.BagRepositoryImpl
import com.mediaproject.data.repository.UserRepositoryImpl
import com.mediaproject.domain.repository.BagRepository
import com.mediaproject.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository

    @Singleton
    @Binds
    abstract fun provideBagRepository(
        bagRepositoryImpl: BagRepositoryImpl
    ): BagRepository

}