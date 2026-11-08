package com.metrolist.music.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.metrolist.music.R

val bbhBartle = FontFamily(
    Font(R.font.bbh_bartle_regular, FontWeight.Normal)
)

// Muse reskin: the Fluid/Lumen Desaturate voice — Montserrat, heavy for titles.
val Montserrat = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_medium, FontWeight.SemiBold),
    Font(R.font.montserrat_heavy, FontWeight.Bold),
    Font(R.font.montserrat_heavy, FontWeight.ExtraBold),
)

private fun Typography.withFont(f: FontFamily) = copy(
    displayLarge = displayLarge.copy(fontFamily = f),
    displayMedium = displayMedium.copy(fontFamily = f),
    displaySmall = displaySmall.copy(fontFamily = f),
    headlineLarge = headlineLarge.copy(fontFamily = f, fontWeight = FontWeight.ExtraBold),
    headlineMedium = headlineMedium.copy(fontFamily = f, fontWeight = FontWeight.ExtraBold),
    headlineSmall = headlineSmall.copy(fontFamily = f, fontWeight = FontWeight.ExtraBold),
    titleLarge = titleLarge.copy(fontFamily = f, fontWeight = FontWeight.ExtraBold),
    titleMedium = titleMedium.copy(fontFamily = f),
    titleSmall = titleSmall.copy(fontFamily = f),
    bodyLarge = bodyLarge.copy(fontFamily = f),
    bodyMedium = bodyMedium.copy(fontFamily = f),
    bodySmall = bodySmall.copy(fontFamily = f),
    labelLarge = labelLarge.copy(fontFamily = f),
    labelMedium = labelMedium.copy(fontFamily = f),
    labelSmall = labelSmall.copy(fontFamily = f),
)

val MuseTypography = Typography().withFont(Montserrat)
