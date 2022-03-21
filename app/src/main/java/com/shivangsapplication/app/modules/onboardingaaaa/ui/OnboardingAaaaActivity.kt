package com.shivangsapplication.app.modules.onboardingaaaa.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityOnboardingAaaaBinding
import com.shivangsapplication.app.modules.onboardingaaaa.`data`.model.ImageSliderGroup15Model
import com.shivangsapplication.app.modules.onboardingaaaa.`data`.viewmodel.OnboardingAaaaVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class OnboardingAaaaActivity :
    BaseActivity<ActivityOnboardingAaaaBinding>(R.layout.activity_onboarding_aaaa) {
  private val imageSliderGroup15Items: ArrayList<ImageSliderGroup15Model> = arrayListOf()

  private val viewModel: OnboardingAaaaVM by viewModels<OnboardingAaaaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup15Adapter = ImageSliderGroup15Adapter(imageSliderGroup15Items,true)
    binding.imageSliderGroup15.adapter = imageSliderGroup15Adapter
    binding.imageSliderGroup15.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup13.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup13.updateIndicatorCounts(binding.imageSliderGroup15.indicatorCount)
    binding.onboardingAaaaVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup15.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup15.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING_AAAA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingAaaaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
