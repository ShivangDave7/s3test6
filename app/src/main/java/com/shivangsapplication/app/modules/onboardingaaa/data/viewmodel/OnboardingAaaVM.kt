package com.shivangsapplication.app.modules.onboardingaaa.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shivangsapplication.app.modules.onboardingaaa.`data`.model.OnboardingAaaModel

public class OnboardingAaaVM : ViewModel() {
  public val onboardingAaaModel: MutableLiveData<OnboardingAaaModel> =
      MutableLiveData(OnboardingAaaModel())

  public var navArguments: Bundle? = null
}
