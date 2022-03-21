package com.shivangsapplication.app.modules.onboardingaaaa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.shivangsapplication.app.databinding.SlideritemOnboardingAaaa1Binding
import com.shivangsapplication.app.modules.onboardingaaaa.`data`.model.ImageSliderGroup15Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup15Adapter(
  public val dataList: ArrayList<ImageSliderGroup15Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup15Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemOnboardingAaaa1Binding) {
      binding.imageSliderGroup15Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingAaaa1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
