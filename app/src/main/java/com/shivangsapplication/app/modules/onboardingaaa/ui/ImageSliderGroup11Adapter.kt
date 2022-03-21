package com.shivangsapplication.app.modules.onboardingaaa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.shivangsapplication.app.databinding.SlideritemOnboardingAaa1Binding
import com.shivangsapplication.app.modules.onboardingaaa.`data`.model.ImageSliderGroup11Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup11Adapter(
  public val dataList: ArrayList<ImageSliderGroup11Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup11Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemOnboardingAaa1Binding) {
      binding.imageSliderGroup11Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingAaa1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
