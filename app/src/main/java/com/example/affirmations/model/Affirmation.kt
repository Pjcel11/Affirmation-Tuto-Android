package com.example.affirmations.model
// pas compris a quoi ca sert : plus ou moins importer les strings depuis les ressources
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
){

}