package com.premierdarkcoffee.hermes.app.features.settings.domain.use_case

import com.premierdarkcoffee.hermes.features.settings.domain.SettingsDataStore
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDarkThemeUseCase @Inject constructor(private val settingsDataStore: SettingsDataStore) {

    operator fun invoke(): Flow<Boolean?> {
        return settingsDataStore.isDarkTheme
    }
}