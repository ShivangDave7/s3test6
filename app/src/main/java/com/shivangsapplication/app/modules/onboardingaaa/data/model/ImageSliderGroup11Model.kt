package com.shivangsapplication.app.modules.onboardingaaa.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ImageSliderGroup11Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtImSuperFast: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_easy_to_use)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadetorockyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bootstrap_based)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremipsumis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrevious: String? = MyApp.getInstance().resources.getString(R.string.lbl_previous)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imageBackgroundimag: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imageLefticon: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imageRightIcon: String? = ""

)
