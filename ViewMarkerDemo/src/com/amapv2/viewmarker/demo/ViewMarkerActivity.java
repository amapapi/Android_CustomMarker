package com.amapv2.viewmarker.demo;

import java.util.List;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

import com.amap.api.maps.model.MarkerOptions;

import com.amp.apis.lib.MarkerOptionsFactory;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author yiyi.qi
 * 
 */
public class ViewMarkerActivity extends Activity implements OnClickListener {
	private AMap mAMap;
	private MapView mMapView;
	int[] colors = { Color.BLUE, Color.RED, Color.GREEN };
	private Drawable drawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_marker);
		// 初始化地图控件
		mMapView = (MapView) findViewById(R.id.map);
		mMapView.onCreate(savedInstanceState);
		init();
	}

	private void init() {
		if (mAMap == null) {
			// 初始化地图
			mAMap = mMapView.getMap();
			// 初始化控件和事件
			Button barButton = (Button) findViewById(R.id.barbutton);
			barButton.setOnClickListener(this);
			Button pieButton = (Button) findViewById(R.id.piebutton);
			pieButton.setOnClickListener(this);
			Button infoButton = (Button) findViewById(R.id.infowindowbutton);
			infoButton.setOnClickListener(this);
//			Button clusterButton=(Button) findViewById(R.id.clusterbutton);
//			clusterButton.setOnClickListener(this);
			drawable = getApplicationContext().getResources().getDrawable(
					R.drawable.outbackground);

			for (int i = 0; i < ConstantUtils.AGEData.length; i++) {
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createPieChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 50);
				// 添加到地图上
				mAMap.addMarker(markerOptions);
			}

		}
	}

	private int getDrawableResource(String content) {
		if (content.equals("雷阵雨")) {
			return R.drawable.stormrain;

		} else if (content.equals("晴")) {
			return R.drawable.sun;
		} else if (content.equals("阵雨")) {
			return R.drawable.rain;
		} else {
			return R.drawable.suncloud;
		}
	}

	// ----------------------------按钮点击事件--------------------------------
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.piebutton:
			mAMap.clear();
			for (int i = 0; i < ConstantUtils.AGEData.length; i++) {
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createPieChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 50);
				// 添加到地图上
				mAMap.addMarker(markerOptions);
			}
			break;
		case R.id.barbutton:
			mAMap.clear();
			for (int i = 0; i < ConstantUtils.AGEData.length; i++) {
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createBarChartMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.AGEData[i], colors, 100);
				// 添加到地图上
				mAMap.addMarker(markerOptions);
			}
			break;
		case R.id.infowindowbutton:
			mAMap.clear();
			for (int i = 0; i < ConstantUtils.AGEData.length; i++) {
				
				Drawable contentDrawable=getApplication().getResources().getDrawable(getDrawableResource(ConstantUtils.contents[i]));
				MarkerOptions markerOptions = MarkerOptionsFactory
						.createInfoWindowMarkerOptions(getApplicationContext(),
								ConstantUtils.latlngs[i],
								ConstantUtils.names[i],
								ConstantUtils.contents[i], drawable,contentDrawable);
				// 添加到地图上
				mAMap.addMarker(markerOptions);
			}
			break;
//		case R.id.clusterbutton:
//			ClusterOverlay clusterOverlay=new ClusterOverlay(mAMap, 200, getApplicationContext());
//			for (int i = 0; i < ConstantUtils.latlngs.length; i++) {
//				clusterOverlay.addLatLng(ConstantUtils.latlngs[i]);
//			}
//			break;
		}

	}

	// -----------------------生命周期必须重写的方法-----------------------------
	/**
	 * 方法必须重写
	 */
	@Override
	protected void onResume() {
		super.onResume();
		mMapView.onResume();
	}

	/**
	 * 方法必须重写
	 */
	@Override
	protected void onPause() {
		super.onPause();
		mMapView.onPause();
	}

	/**
	 * 方法必须重写
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		mMapView.onSaveInstanceState(outState);
	}

	/**
	 * 方法必须重写
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		mMapView.onDestroy();
	}

}
