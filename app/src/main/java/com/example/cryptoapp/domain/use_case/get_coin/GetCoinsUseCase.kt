package com.example.cryptoapp.domain.use_case.get_coin

import com.example.cryptoapp.common.Resource
import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor( private val repository: CoinRepository) {

    operator  fun invoke(): Flow<Resource<List<Coin>>>
}