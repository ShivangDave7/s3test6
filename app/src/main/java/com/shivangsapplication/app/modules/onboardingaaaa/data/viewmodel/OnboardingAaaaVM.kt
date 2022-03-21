package com.shivangsapplication.app.modules.onboardingaaaa.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shivangsapplication.app.modules.onboardingaaaa.`data`.model.OnboardingAaaaModel

public class OnboardingAaaaVM : ViewModel() {
  public val onboardingAaaaModel: MutableLiveData<OnboardingAaaaModel> =
      MutableLiveData(OnboardingAaaaModel())

  public var navArguments: Bundle? = null
}
