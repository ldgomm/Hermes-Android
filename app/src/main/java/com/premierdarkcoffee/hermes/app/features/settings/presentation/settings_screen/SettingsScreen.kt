package com.premierdarkcoffee.hermes.app.features.settings.presentation.settings_screen

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun SettingsScreen() {

    val viewModel: SettingsViewModel = hiltViewModel()
    val uiState = viewModel.uiState.collectAsStateWithLifecycle()

    SettingsScreenContent(isDarkTheme = uiState.value.isDarkTheme ?: isSystemInDarkTheme()) {
        viewModel.onEvent(SettingsEvent.DarkModeToggled(it))
    }
}

@Composable
fun SettingsScreenContent(isDarkTheme: Boolean, onDarkModeToggled: (Boolean) -> Unit) {

    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Spacer(modifier = Modifier.height(32.dp))
            DarkModeSwitch(isDarkTheme = isDarkTheme,
                           onDarkModeToggled = onDarkModeToggled,
                           modifier = Modifier.padding(horizontal = 24.dp))

        }
    }
}

@Composable
fun DarkModeSwitch(isDarkTheme: Boolean, onDarkModeToggled: (Boolean) -> Unit, modifier: Modifier = Modifier) {

    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()) {
//        Icon(painter = painterResource(id = R.drawable.icon_moon), contentDescription = null)
        Spacer(modifier = Modifier.width(12.dp))
//        Text(text = stringResource(id = R.string.dark_mode))
        Spacer(modifier = Modifier.weight(1f))
        Switch(checked = isDarkTheme, onCheckedChange = onDarkModeToggled)
    }
}