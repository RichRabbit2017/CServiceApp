package com.india.cservices.utils;


import android.util.Log;

import com.india.cservices.BuildConfig;


public class AppLogger {

	public static void d(String TAG, String text) {
		if (BuildConfig.DEBUG) {
			Log.d(TAG, text);
		}
	}

	public static void i(String TAG, String text) {
		if (BuildConfig.DEBUG) {
			Log.i(TAG, text);
		}
	}

	public static void e(String TAG, String text) {

		if (BuildConfig.DEBUG) {
			Log.e(TAG, text);
		}
	}

	public static void v(String TAG, String text) {

		if (BuildConfig.DEBUG) {
			Log.v(TAG, text);
		}
	}

	public static void critical(String TAG, String text) {
		Log.e(TAG, text);
	}

}
