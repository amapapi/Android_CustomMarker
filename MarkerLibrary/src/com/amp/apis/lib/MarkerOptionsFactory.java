package com.amp.apis.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Gravity;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;

/**
 * @author yiyi.qi 
 * 
 */
public class MarkerOptionsFactory {

	/**
	 * 获取infowindow样式的markeroptions
	 * 
	 * @param context
	 * @param latlon
	 *            获取infowindow样式的markeroptions
	 * @param title
	 *            marker的title信息（可以为空，空则不显示标题信息）
	 * @param content
	 *            详细描述消息（可以为空，空则不显示详细信息）
	 * @param drawable
	 *            背景图片
	 * @param contentDrawable
	 *            内容图片（可以为空，空则不显示图片）
	 * @return
	 */
	public static MarkerOptions createInfoWindowMarkerOptions(Context context,
			LatLng latlon, String title, String content, Drawable drawable,
			Drawable contentDrawable) {
		MarkerOptions markerOptions = new MarkerOptions();

		LinearLayout linearLayout = new LinearLayout(context);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		if ((title != null) || (!"".equals(title))) {
			TextView textView = new TextView(context);
			textView.setText(title);
			textView.setGravity(Gravity.CENTER);
			textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
			textView.setTextColor(Color.BLACK);
			linearLayout.addView(textView);
		}
		LinearLayout contentLayout = new LinearLayout(context);
		if ((content != null) || (!"".equals(content))) {
			TextView contentView = new TextView(context);
			contentView.setText(content);
			contentView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
			contentView.setTextColor(Color.BLACK);
			contentView.setGravity(Gravity.CENTER_VERTICAL);
			LayoutParams textparams = new LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
			contentView.setLayoutParams(textparams);
			contentLayout.addView(contentView);
		}
		if (contentDrawable != null) {
			ImageView imageView = new ImageView(context);
			imageView.setImageDrawable(contentDrawable);
			contentLayout.addView(imageView);
		}

		linearLayout.addView(contentLayout);
		if (drawable != null) {
			linearLayout.setBackgroundDrawable(drawable);
		}
		// 通过View获取BitmapDescriptor对象
		BitmapDescriptor markerIcon = BitmapDescriptorFactory
				.fromView(linearLayout);
		markerOptions.position(latlon).icon(markerIcon).title(title)
				.anchor(0.5f, 0.5f);
		return markerOptions;
	}

	/**
	 * 根据传入的数据对数据进行绘制饼状图
	 * 
	 * @param context
	 * @param latlon
	 *            位置信息
	 * @param quantities
	 *            统计图统计信息
	 * @param colors
	 *            饼图对应的颜色信息
	 * @param radius
	 *            饼图的半径
	 * @return
	 */
	public static MarkerOptions createPieChartMarkerOptions(Context context,
			LatLng latlon, double[] quantities, int[] colors, int radius) {
		MarkerOptions markerOptions = new MarkerOptions();
		Bitmap bitmap = Bitmap.createBitmap(radius * 2, radius * 2,
				Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		Paint paint = new Paint();
		double sum = 0;
		float angle = 0;
		float swepAngle = 0;
		RectF rectF = new RectF(0, 0, radius * 2, radius * 2);
		for (int i = 0; i < quantities.length; i++) {
			sum += quantities[i];
		}
		for (int i = 0; i < quantities.length; i++) {
			swepAngle = (float) (quantities[i] / sum * 360);
			paint.setColor(colors[i]);
			canvas.drawArc(rectF, angle, swepAngle, true, paint);
			angle += swepAngle;
		}
		BitmapDescriptor markerIcon = BitmapDescriptorFactory
				.fromBitmap(bitmap);
		markerOptions.position(latlon).icon(markerIcon).anchor(0.5f, 0.5f);
		return markerOptions;
	}

	/**
	 * 根据传入的数据对数据进行绘制柱状图
	 * 
	 * @param context
	 * @param latlon
	 *            数据位置信息
	 * @param quantities
	 *            数据统计信息
	 * @param colors
	 *            不同柱状统计图对应的颜色
	 * @param radius
	 *            柱状图的尺寸（单位px）
	 * @return
	 */
	public static MarkerOptions createBarChartMarkerOptions(Context context,
			LatLng latlon, double[] quantities, int[] colors, int radius) {
		MarkerOptions markerOptions = new MarkerOptions();
		Bitmap bitmap = Bitmap.createBitmap(radius, radius, Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		Paint paint = new Paint();
		double max = 0;
		int height = 0;
		int count = quantities.length;
		for (int i = 0; i < count; i++) {
			if (quantities[i] > max) {
				max = quantities[i];
			}

		}
		for (int i = 0; i < count; i++) {
			height = (int) (quantities[i] / max * radius);
			paint.setColor(colors[i]);
			RectF rect = new RectF(radius / count * i, radius - height, radius
					/ count * (i + 1), radius);
			canvas.drawRect(rect, paint);

		}

		BitmapDescriptor markerIcon = BitmapDescriptorFactory
				.fromBitmap(bitmap);
		markerOptions.position(latlon).icon(markerIcon).anchor(0.5f, 0.5f);
		return markerOptions;
	}

}
