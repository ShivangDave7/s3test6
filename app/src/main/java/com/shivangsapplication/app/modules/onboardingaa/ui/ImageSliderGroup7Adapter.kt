package com.shivangsapplication.app.modules.onboardingaa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.shivangsapplication.app.databinding.SlideritemOnboardingAa1Binding
import com.shivangsapplication.app.modules.onboardingaa.`data`.model.ImageSliderGroup7Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup7Adapter(
  public val dataList: ArrayList<ImageSliderGroup7Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup7Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemOnboardingAa1Binding) {
      binding.imageSliderGroup7Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingAa1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
