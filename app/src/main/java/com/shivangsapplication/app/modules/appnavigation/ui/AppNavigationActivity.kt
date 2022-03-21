package com.shivangsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityAppNavigationBinding
import com.shivangsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.shivangsapplication.app.modules.onboardinga.ui.OnboardingAActivity
import com.shivangsapplication.app.modules.onboardingaa.ui.OnboardingAaActivity
import com.shivangsapplication.app.modules.onboardingaaa.ui.OnboardingAaaActivity
import com.shivangsapplication.app.modules.onboardingaaaa.ui.OnboardingAaaaActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearOnboardingA.setOnClickListener {
      val destIntent = OnboardingAActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingAA.setOnClickListener {
      val destIntent = OnboardingAaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingAAAA.setOnClickListener {
      val destIntent = OnboardingAaaaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingAAA.setOnClickListener {
      val destIntent = OnboardingAaaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
