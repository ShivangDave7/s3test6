package com.shivangsapplication.app.modules.onboardingaa.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ImageSliderGroup7Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtImSuperFast: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dark_mode_ready)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadetorockyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_off_the_li)
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
