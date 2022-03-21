package com.shivangsapplication.app.modules.onboardingaa.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.base.BaseActivity
import com.shivangsapplication.app.databinding.ActivityOnboardingAaBinding
import com.shivangsapplication.app.modules.onboardingaa.`data`.model.ImageSliderGroup7Model
import com.shivangsapplication.app.modules.onboardingaa.`data`.viewmodel.OnboardingAaVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class OnboardingAaActivity :
    BaseActivity<ActivityOnboardingAaBinding>(R.layout.activity_onboarding_aa) {
  private val imageSliderGroup7Items: ArrayList<ImageSliderGroup7Model> = arrayListOf()

  private val viewModel: OnboardingAaVM by viewModels<OnboardingAaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup7Adapter = ImageSliderGroup7Adapter(imageSliderGroup7Items,true)
    binding.imageSliderGroup7.adapter = imageSliderGroup7Adapter
    binding.imageSliderGroup7.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup5.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup5.updateIndicatorCounts(binding.imageSliderGroup7.indicatorCount)
    binding.onboardingAaVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup7.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup7.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDING_AA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingAaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
