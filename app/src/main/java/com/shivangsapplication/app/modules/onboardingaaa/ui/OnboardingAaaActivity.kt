package com.shivangsapplication.app.modules.onboardingaaa.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityOnboardingAaaBinding
import com.shivangsapplication.app.modules.onboardingaaa.`data`.model.ImageSliderGroup11Model
import com.shivangsapplication.app.modules.onboardingaaa.`data`.viewmodel.OnboardingAaaVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class OnboardingAaaActivity :
    BaseActivity<ActivityOnboardingAaaBinding>(R.layout.activity_onboarding_aaa) {
  private val imageSliderGroup11Items: ArrayList<ImageSliderGroup11Model> = arrayListOf()

  private val viewModel: OnboardingAaaVM by viewModels<OnboardingAaaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup11Adapter = ImageSliderGroup11Adapter(imageSliderGroup11Items,true)
    binding.imageSliderGroup11.adapter = imageSliderGroup11Adapter
    binding.imageSliderGroup11.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup9.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup9.updateIndicatorCounts(binding.imageSliderGroup11.indicatorCount)
    binding.onboardingAaaVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup11.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup11.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING_AAA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingAaaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
