package com.shivangsapplication.app.modules.appnavigation.`data`.model

import com.shivangsapplication.app.R
import com.shivangsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnboardingA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_onboarding_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnboardingAA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_onboarding_aa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnboardingAAA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_onboarding_aaa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnboardingAAAA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_onboarding_aaaa)

)
